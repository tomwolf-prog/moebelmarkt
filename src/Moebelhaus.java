import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.*;

import Kategorie.*;
import Kategorie.Lagerung.Flaeche;
import Kategorie.Lagerung.Moebelart;
import Lager.*;

public class Moebelhaus extends JFrame implements ActionListener {

    public Moebelhaus(Lagersystem lagersystem) {
        //Erstellen des Frame
    	JFrame f = new JFrame("Button Example");  
    	
        //Erstellen von AddItem Button
        JButton addItem=new JButton("Add Item");  
        addItem.setBounds(150,200,95,30);  
        addItem.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	addItemScreen(lagersystem);
            	f.dispose();
            } 
        });
        f.add(addItem);  
    	
        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");  
        exit.setBounds(150,300,95,30);  
        exit.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	myMethod();
            	f.dispose();
            } 
        });
        f.add(exit);  
        
        f.setSize(1600,900);  
        f.setLayout(null);  
        f.setVisible(true);   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    
    public void addItemScreen(Lagersystem lagersystem) {
    	//Erstellen des Frame
    	JFrame addItemScreen = new JFrame("Button Example");  
    	
        //Erstellen von AddItem Button
        JButton addLagerung=new JButton("Add Lagerung");  
        addLagerung.setBounds(150,50,150,30);  
        addLagerung.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	addLagerungScreen(lagersystem);
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(addLagerung);  
        
        //Erstellen von AddItem Button
        JButton addLiegemoebel=new JButton("Add Liefemoebel");  
        addLiegemoebel.setBounds(150,100,150,30);  
        addLiegemoebel.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(addLiegemoebel); 
        
        //Erstellen von AddItem Button
        JButton addSitzmoebel=new JButton("Add Sitzmoebel");  
        addSitzmoebel.setBounds(150,150,150,30);  
        addSitzmoebel.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(addSitzmoebel); 
        
        //Erstellen von AddItem Button
        JButton addTische=new JButton("Add Tische");  
        addTische.setBounds(150,200,150,30);  
        addTische.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(addTische); 
        
        //Erstellen von AddItem Button
        JButton cancel=new JButton("Cancel");  
        cancel.setBounds(150,250,150,30);  
        cancel.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	new Moebelhaus(lagersystem);
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(cancel); 
    	
        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");  
        exit.setBounds(150,300,150,30);  
        exit.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	myMethod();
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(exit);  
        
        addItemScreen.setSize(1600,900);  
        addItemScreen.setLayout(null);  
        addItemScreen.setVisible(true);   
        addItemScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
 }
    
    public void addLagerungScreen(Lagersystem lagersystem){
    	//Erstellen des Frame
    	JFrame addItemScreen = new JFrame("Button Example");  
    	
        //Erstellen von AddItem Button
        JButton addKleiderschrank=new JButton("Add Kleiderschrank");  
        addKleiderschrank.setBounds(150,50,150,30);  
        addKleiderschrank.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	addKleiderschrankScreen(lagersystem);
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(addKleiderschrank);  
        
        //Erstellen von AddItem Button
        JButton addKuechenregallager=new JButton("Add Kuechenregallager");  
        addKuechenregallager.setBounds(150,100,150,30);  
        addKuechenregallager.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(addKuechenregallager); 
        
        //Erstellen von AddItem Button
        JButton cancel=new JButton("Cancel");  
        cancel.setBounds(150,250,150,30);  
        cancel.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	new Moebelhaus();
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(cancel); 
    	
        
        
        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");  
        exit.setBounds(150,300,150,30);  
        exit.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	myMethod();
            	addItemScreen.dispose();
            } 
        });
        addItemScreen.add(exit);  
        
        addItemScreen.setSize(1600,900);  
        addItemScreen.setLayout(null);  
        addItemScreen.setVisible(true);   
        addItemScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	
    }
    
    public void addKleiderschrankScreen(Lagersystem lagersystem){
    	//Erstellen des Frame
    	JFrame addKleiderschank = new JFrame("Button Example");  
    	
        //Erstellen von AddItem Button
        JButton addKleiderschrankS=new JButton("Add Kleiderschrank S");  
        addKleiderschrankS.setBounds(150,50,150,30);  
        addKleiderschrankS.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	lagersystem.addLagerung(new Lagerung(Moebelart.Kleiderschrank, Flaeche.s));
            	new Moebelhaus(lagersystem);
            	addKleiderschank.dispose();
            } 
        });
        addKleiderschank.add(addKleiderschrankS);  
        
        //Erstellen von AddItem Button
        JButton addKleiderschrankM=new JButton("Add Kuechenregallager M");  
        addKleiderschrankM.setBounds(150,100,150,30);  
        addKleiderschrankM.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	lagersystem.addLagerung(new Lagerung(Moebelart.Kleiderschrank, Flaeche.m));
            	new Moebelhaus(lagersystem);
            	addKleiderschank.dispose();
            } 
        });
        addKleiderschank.add(addKleiderschrankM); 
        
        //Erstellen von AddItem Button
        JButton addKleiderschrankL=new JButton("Add Kuechenregallager L");  
        addKleiderschrankL.setBounds(150,150,150,30);  
        addKleiderschrankL.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	lagersystem.addLagerung(new Lagerung(Moebelart.Kleiderschrank, Flaeche.l));
            	new Moebelhaus(lagersystem);
            	addKleiderschank.dispose();
            } 
        });
        addKleiderschank.add(addKleiderschrankL); 
        
        //Erstellen von AddItem Button
        JButton addKleiderschrankXL=new JButton("Add Kuechenregallager XL");  
        addKleiderschrankXL.setBounds(150,200,150,30);  
        addKleiderschrankXL.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	lagersystem.addLagerung(new Lagerung(Moebelart.Kleiderschrank, Flaeche.xl));
            	new Moebelhaus(lagersystem);
            	addKleiderschank.dispose();
            } 
        });
        addKleiderschank.add(addKleiderschrankXL); 
        
        //Erstellen von AddItem Button
        JButton cancel=new JButton("Cancel");  
        cancel.setBounds(150,250,150,30);  
        cancel.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	new Moebelhaus();
            	addKleiderschank.dispose();
            } 
        });
        addKleiderschank.add(cancel); 
    	
        
        
        //Erstellen von Exit Button
        JButton exit=new JButton("Exit");  
        exit.setBounds(150,300,150,30);  
        exit.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	myMethod();
            	addKleiderschank.dispose();
            } 
        });
        addKleiderschank.add(exit);  
        
        addKleiderschank.setSize(1600,900);  
        addKleiderschank.setLayout(null);  
        addKleiderschank.setVisible(true);   
        addKleiderschank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    	
    }
    
    
    	
	public static void main(String[] args) {
		Lagersystem lagersystem = new Lagersystem();
        new Moebelhaus(lagersystem);
        
    }

    public void myMethod() {
        JOptionPane.showMessageDialog(this, "Byes");
    }
    
}
