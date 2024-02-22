import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Moebelhaus extends JFrame implements ActionListener {

    public Moebelhaus() {
        //Erstellen des Frame
    	JFrame f = new JFrame("Button Example");  
    	
        //Erstellen von AddItem Button
        JButton addItem=new JButton("Add Item");  
        addItem.setBounds(150,200,95,30);  
        addItem.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
            	addItemScreen();
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
    
    public void addItemScreen() {
    	//Erstellen des Frame
    	JFrame addItemScreen = new JFrame("Button Example");  
    	
        //Erstellen von AddItem Button
        JButton addLagerung=new JButton("Add Lagerung");  
        addLagerung.setBounds(150,50,150,30);  
        addLagerung.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	addLagerungScreen();
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
    
    public void addLagerungScreen(){
    	//Erstellen des Frame
    	JFrame addItemScreen = new JFrame("Button Example");  
    	
        //Erstellen von AddItem Button
        JButton addKleiderschrank=new JButton("Add Kleiderschrank");  
        addKleiderschrank.setBounds(150,50,150,30);  
        addKleiderschrank.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
            	addLagerungScreen();
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
    
    
    	
	public static void main(String[] args) {
        new Moebelhaus();
        
    }

    public void myMethod() {
        JOptionPane.showMessageDialog(this, "Byes");
    }
    
}
