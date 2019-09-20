/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.federationanimalclinic.gui;
import javax.swing.*;

import com.federationanimalclinic.beans.Animal;
import com.federationanimalclinic.beans.AnimalGUI;
import com.federationanimalclinic.beans.Appointment;
import com.federationanimalclinic.beans.Clinic;
import com.federationanimalclinic.beans.Veterinarian;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class MainGUI  implements ActionListener{

    private static void updatePetAndVetList(String petName, String vetName){
      for(int i=0;i<animalListCopy.size();i++){
          Animal animal = animalListCopy.get(i);
          if(animal.getName().equals(petName)){
              MainGUI.animalList.add(animal);
          }
      }
      for(int i=0;i<vetListCopy.size();i++){
          Veterinarian veterinarian = vetListCopy.get(i);
          if(veterinarian.getName().equals(vetName)){
              MainGUI.vetList.add(veterinarian);
          }
      }
    }

 
	JFrame mainJFrame;
	JPanel topPanel;
	JButton jbAppointments, jbAnimals, jbVeterinarians, jbFees, jbQuit;
	Clinic c;
        private static ArrayList<Veterinarian> vetList;
        private static ArrayList<Animal> animalList;
        private static ArrayList<Veterinarian> vetListCopy;
        private static ArrayList<Animal> animalListCopy; 
        private static ArrayList<Appointment> appointmentList;
        
        public static ArrayList<Veterinarian> getVetList(){
        return vetList;
        }
        public static ArrayList<Animal> getAnimalList(){
        return animalList;
        }
        public static ArrayList<Appointment> getAppointmentList(){
        return appointmentList;
        }
        public static void setVetList(ArrayList<Veterinarian> vetList){
            
            MainGUI.vetList = vetList;
        
        }
        public static void setAnimalList(ArrayList<Animal> animalList){
       
        MainGUI.animalList = animalList;
        }
        public static void setAppointmentList(ArrayList<Appointment> appointmentList){
        MainGUI.appointmentList = appointmentList;
        }
        public static boolean removeAppointment(String petName){
            for(int i=0;i<appointmentList.size();i++){
                Appointment appointment = appointmentList.get(i);
                if(appointment.getPetName().equals(petName)){
                    appointmentList.remove(i);
                    updatePetAndVetList(appointment.getPetName().toString(),
                            appointment.getVetName().toString());
                    return true;
                }
                
            }
            return false;
        }
	public MainGUI() {
		mainJFrame = new JFrame(" Federation Animal Clinic ");
		mainJFrame.setBounds(0,100,350,300);
		mainJFrame.setLayout(new BorderLayout(20,20));
		c = new Clinic("FederationClinic.csv");
                
                vetList = c.getVeterinarians();
                animalList = c.getAnimals();
                vetListCopy = c.getVeterinarians();
                animalListCopy = c.getAnimals();
	}
	public void startGUI() {
		this.mainJFrame.add(createTopPanel(), BorderLayout.NORTH);
		JPanel emptyPanel = new JPanel();
		this.mainJFrame.add(emptyPanel, BorderLayout.WEST);
		this.mainJFrame.add(emptyPanel, BorderLayout.EAST);
		this.mainJFrame.add(createMainPanel(), BorderLayout.CENTER);
		this.mainJFrame.add(createBottomPanel(), BorderLayout.SOUTH);
		this.mainJFrame.setEnabled(true);
		this.mainJFrame.setVisible(true);
                
                
                this.mainJFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    mainJFrame.dispose();
                }
                });
	}
	public JPanel createTopPanel() {
		topPanel = new JPanel();
		topPanel.setLayout(new BorderLayout(10,10));
		ImageIcon ii = new ImageIcon(getAnimalImage());
		JLabel jlpic = new JLabel(ii);
		jlpic.setSize(5,5);
		topPanel.add(jlpic, BorderLayout.WEST);
		topPanel.add(new JLabel("Federation Animal Clinic System"), BorderLayout.CENTER);
		JLabel helpLabel = new JLabel("Help");
		helpLabel.setEnabled(false);
		topPanel.add(helpLabel, BorderLayout.EAST);
		topPanel.setVisible(true);
		return topPanel;
	}
	private Image getAnimalImage() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		return kit.getImage("dog.jpg"); //https://pixabay.com/photos/dog-animal-portrait-pet-brown-3277416/
	}
	private JPanel createMainPanel() {
		JPanel jp = new JPanel();
		//jp.setLayout(new BoxLayout(jp, BoxLayout.PAGE_AXIS));
		jp.setLayout(new GridLayout(4,3,20,7));
		jbAppointments = new JButton("Appointments");
		jp.add(jbAppointments);
		jbAppointments.addActionListener(this);
		jbAnimals = new JButton("Animals");
		jbAnimals.addActionListener(this);
		jp.add(jbAnimals);
		jbVeterinarians = new JButton("Veterinarians");
		jp.add(jbVeterinarians);
		jbVeterinarians.setEnabled(false);
		jbFees  = new JButton("Fees");
		jbFees.setEnabled(false);
		jp.add(jbFees);
		
		//jp.add(new JLabel(" ")); // to force empty 3rd column in grid layout
		return jp;
	}
	private JPanel createBottomPanel() {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		jbQuit = new JButton("Quit");
		jp.add(jbQuit, BorderLayout.EAST);
		jbQuit.addActionListener(this);
		return jp;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		AnimalGUI agui;
		ManageBookingsGUI bgui;
		if (e.getSource() == jbAnimals) 
			agui = new AnimalGUI(c.getAnimals());
		else if (e.getSource() == jbAppointments) {
			bgui = new ManageBookingsGUI(c);
		}
		else if (e.getSource() == jbQuit)
			System.exit(0);
	}
}
