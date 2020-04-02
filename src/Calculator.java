import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Window.Type;



class Calculator extends JFrame  {
    /*Variable pour function menubar()*/
    private JMenuBar    menuBar;
    private JMenu       fichier;
    private JMenu       aide;
    private JMenuItem   Quitte ;
    private JMenuItem   apropos;
    /* All Button*/
    private JButton  Bracine;
    private JButton  b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private JButton  Bpi;
    private JButton  Bclear;
    private JButton  Begale;
    private JButton  Bradio;
    private JButton  Badd;
    private JButton  Bsous;
    private JButton  Bmulti;
    private JButton  Bdiv;
    private JTextField text;
    private JButton btnx;
    private JButton Bracine_1;
    private JButton Bracine_2;
    private JButton btnCos;
    private JButton btnLog;
    private JButton btnLn;
    private JButton btnua;
    private JButton btnx_1;
    private JButton btnx_2;
    private JButton btnExp;
    private JButton btnXy;
    private JButton btnX;
    private JButton btnX_1;
    private JButton btnSinh;
    private JButton btnCosh;
    private JButton Bracine_3;
    private JButton btnExp_1;
    private JButton Bracine_4;
    private JButton btnMod;
    private JButton Bracine_5;
    private JButton Bracine_6;
    private JButton Bracine_7;
    private JButton btnOff;
    private JButton btnCe;
    JButton btnSci;
    private JButton btnCe_1;
    
    /*attribue utiliser*/
    int radio=1;
    double firstNum ;
    double secondNum;
    double result;
    String operations;
    String answer;
    /*Main du class*/
      public static void main(String[] args)
      {
          //Déclaraction du constructeur ;
          Calculator c = new Calculator();

     }
     public Calculator()
     {
     	setFocusCycleRoot(false);
     	setFocusTraversalKeysEnabled(false);
     	setFocusable(false);
     	setFocusableWindowState(false);
     	setRootPaneCheckingEnabled(false);
     	setResizable(false);
     	setIconImage(Toolkit.getDefaultToolkit().getImage("/home/sokaina/eclipse-workspace/Project IHM/img/images.png"));
     	setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
     	getContentPane().setForeground(new Color(255, 255, 255)); 
        getContentPane().setVisible(true);
        getContentPane().setEnabled(false);
        setBackground(new Color(0, 0, 0));
        getContentPane().setBackground(new Color(0, 0, 0));
        getContentPane().setLayout(null);
        /*Appele du Fonction MenuBar*/
         MenuBar();
         /*Appel du Fonction Text*/
         Text();
         /*Appel du Button de l'interface Graphique */
         Buttons();
         /*Apple du l'interface Graphique*/
         UI(this);
     }
          /*Fuction du BarMenu*/
     private void MenuBar()
      {
               menuBar = new JMenuBar();
               menuBar.setBorderPainted(false);
               menuBar.setForeground(new Color(255, 255, 255));
               menuBar.setBorder(null);
               menuBar.setBackground(new Color(0, 0, 0));
               fichier = new JMenu("Fichier");
               fichier.setFont(new Font("Ubuntu", Font.BOLD, 14));
               fichier.setForeground(new Color(255, 255, 255));
               aide = new JMenu("Aide");
               aide.setForeground(new Color(255, 255, 255));
               aide.setFont(new Font("Ubuntu", Font.BOLD, 14));
               apropos = new JMenuItem("Apropos");
               Quitte = new JMenuItem("Quitter");
               setJMenuBar(menuBar);
               menuBar.add(fichier);
               menuBar.add(aide);
               fichier.add(Quitte);
               aide.add(apropos);
               /*action de Quitter */
               Quitte.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent actionEvent) {
                      System.exit(0);
                  }
                });
               /*action apropos*/
               apropos.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent actionEvent) {
                       JOptionPane.showMessageDialog(null,"" +
                               " Sokaina Daabal Programmor In ESTSB \n" +
                               "        Toute les Droits Réservés     " ,
                               "Project IHM" ,JOptionPane.INFORMATION_MESSAGE);
                   }
               });

          }
            /*end MenuBar*/
            /*Function Inteface Graphique */
          private void  UI(Calculator app)
          {
        	  app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	  app.setTitle("Calculatrice Standard");
        	  app.setSize(280, 412);
        	  text.setBounds(10, 10, 260, 99);
              text.setEditable(false);
              text.setFont(new Font("Times New Roman", 1, 12));
              /*Navigation entre Calculatrice Scientifique et Standard*/
        	  btnSci.addActionListener(new ActionListener() {
                  @Override 
                  public void actionPerformed(ActionEvent actionEvent) {
                     radio++;
                      if (radio % 2 == 0) {
                          app.setTitle("Calculatrice Scientifique");
                          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          app.setSize(560, 416);
                          app.setResizable(false);
                          text.setBounds(12, 12, 536, 99);
                          text.setEditable(false);
                          text.setFont(new Font("Times New Roman", 1, 12));
                      } else {

                          app.setTitle("Calculatrice Standard");
                          app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                          app.setSize(280, 412);
                          app.setResizable(false);
                          text.setBounds(10, 10, 260, 99);
                          text.setEditable(false);
                          text.setFont(new Font("Times New Roman", 1, 12));
                      }
                      
                  }});
              app.setVisible(true);
          }
          /*end Interface Garphique */
          /*Fuction  Text*/
                   private void Text()
                    {
                	   text = new JTextField("O");
                	   text.setBorder(null);
                	   text.setBackground(Color.WHITE);
                       text.setBounds(12, 12, 536, 99);
                       text.setEditable(false);
                       text.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                       text.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                       getContentPane().add(text);
                    }
          /*end Function Text*/
          /*Fuction Button*/        
          private void Buttons() {
             /*Button Racine*/
        	  Bracine = new JButton("\u221A");
        	  Bracine.setBorder(null);
        	  Bracine.setBackground(new Color(0, 128, 128));
        	  Bracine.setForeground(new Color(255, 255, 255));
              Bracine.setBounds(486, 125, 62, 35);
              Bracine.addActionListener(new ActionListener() {
                  

                  @Override
                  public void actionPerformed(ActionEvent actionEvent) {
                	  double ops = Double.parseDouble(String.valueOf(text.getText()));
                      ops = Math.sqrt(ops);
                      text.setText(String.valueOf(ops));

                  }
              });
              getContentPane().add(Bracine);
              /*Button du Nombre 0*/
              b0=new JButton("0");
              b0.setBorder(null);
              b0.setBackground(new Color(112, 128, 144));
              b0.setForeground(Color.WHITE);
              b0.setBounds(12,318,128,35);
              b0.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("0"))
            		  {
            			  text.setText(b0.getText());
            		  }
            		  else text.setText(text.getText()+b0.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b0);
              /*Button du Nombre 1*/
              b1=new JButton("1");
              b1.setBorder(null);
              b1.setBackground(new Color(112, 128, 144));
              b1.setForeground(Color.WHITE);
              b1.setAlignmentX(Component.RIGHT_ALIGNMENT);
              b1.setFont(new Font("Dialog", Font.BOLD, 12));
              b1.setBounds(12,278,62,35);
              b1.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("1"))
            		  {
            			  text.setText(b1.getText());
            		  }
            		  else text.setText(text.getText()+b1.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b1);
              /*Button du Nombre 2*/
              b2=new JButton("2");
              b2.setBorder(null);
              b2.setBackground(new Color(112, 128, 144));
              b2.setForeground(Color.WHITE);
              b2.setAlignmentX(Component.RIGHT_ALIGNMENT);
              b2.setBounds(78,278,62,35);
              b2.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("2"))
            		  {
            			  text.setText(b0.getText());
            		  }
            		  else text.setText(text.getText()+b2.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b2);
              /*Button du Nombre 3*/
              b3=new JButton("3");
              b3.setBorder(null);
              b3.setBackground(new Color(112, 128, 144));
              b3.setForeground(Color.WHITE);
              b3.setBounds(145,278,62,35);
              b3.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("3"))
            		  {
            			  text.setText(b3.getText());
            		  }
            		  else text.setText(text.getText()+b3.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b3);
              /*Button du Nombre 4*/
              b4=new JButton("4");
              b4.setBackground(new Color(112, 128, 144));
              b4.setBorder(null);
              b4.setForeground(Color.WHITE);
              b4.setAlignmentX(Component.CENTER_ALIGNMENT);
              b4.setFont(new Font("Serif", Font.BOLD, 12));
              b4.setBounds(12,239,62,35);
              b4.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("4"))
            		  {
            			  text.setText(b0.getText());
            		  }
            		  else text.setText(text.getText()+b4.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b4);
              /*Button du Nombre 5*/
              b5=new JButton("5");
              b5.setBorder(null);
              b5.setBackground(new Color(112, 128, 144));
              b5.setForeground(Color.WHITE);
              b5.setAlignmentX(Component.CENTER_ALIGNMENT);
              b5.setFont(new Font("Serif", Font.BOLD, 12));
              b5.setBounds(78,239,62,35);
              b5.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("5"))
            		  {
            			  text.setText(b0.getText());
            		  }
            		  else text.setText(text.getText()+b5.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b5);
              /*Button du Nombre 6*/
              b6=new JButton("6");
              b6.setBorder(null);
              b6.setBackground(new Color(112, 128, 144));
              b6.setForeground(Color.WHITE);
              b6.setAlignmentX(Component.CENTER_ALIGNMENT);
              b6.setFont(new Font("Serif", Font.BOLD, 12));
              b6.setBounds(145,239,62,35);
              b6.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("6"))
            		  {
            			  text.setText(b0.getText());
            		  }
            		  else text.setText(text.getText()+b6.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b6);
              /*Button du Nombre 7*/
              b7=new JButton("7");
              b7.setBorder(null);
              b7.setBackground(new Color(112, 128, 144));
              b7.setForeground(Color.WHITE);
              b7.setFont(new Font("Serif", Font.BOLD, 12));
              b7.setBounds(12,200,62,35);
              b7.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("7"))
            		  {
            			  text.setText(b7.getText());
            		  }
            		  else text.setText(text.getText()+b7.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b7);
              /*Button du Nombre 8*/
              b8=new JButton("8");
              b8.setForeground(Color.WHITE);
              b8.setBackground(new Color(112, 128, 144));
              b8.setBorder(null);
              b8.setAlignmentY(1.0f);
              b8.setAlignmentX(Component.CENTER_ALIGNMENT);
              b8.setFont(new Font("Serif", Font.BOLD, 12));
              b8.setBounds(78,200,62,35);
              b8.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("8"))
            		  {
            			  text.setText(b8.getText());
            		  }
            		  else text.setText(text.getText()+b8.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b8);
              /*Button du Nombre 9*/
              b9=new JButton("9");
              b9.setBorder(null);
              b9.setBackground(new Color(112, 128, 144));
              b9.setForeground(Color.WHITE);
              b9.setFont(new Font("Serif", Font.BOLD, 12));
              b9.setBounds(145,200,62,35);
              b9.addActionListener(new ActionListener()
               {
            	  public void actionPerformed(ActionEvent e)
            	  {
            		  if(text.getText().equals("9"))
            		  {
            			  text.setText(b9.getText());
            		  }
            		  else text.setText(text.getText()+b9.getText());
            	  
            	  }
            	});
              
              getContentPane().add(b9);
              /*Button d'égale*/
              Begale = new JButton(" =");
              Begale.setBorder(null);
              Begale.setForeground(new Color(255, 255, 255));
              Begale.setBackground(new Color(0, 128, 128));
              Begale.setBounds(209,278,62,75);
              Begale.addActionListener(new ActionListener()
              {
              
           	  public void actionPerformed(ActionEvent e)
           	  {
           		String answer ;
                secondNum = Double.parseDouble(text.getText());
                if(operations == "+")
                {
                    result = firstNum + secondNum;
                    answer = String.format("%.2f", result);
                    text.setText(answer);
                }

                else if(operations == "-")
                {
                    result = firstNum - secondNum;
                    answer = String.format("%.2f", result);
                    text.setText(answer);
                }

                else if(operations == "*")
                {
                    result = firstNum * secondNum;
                    answer = String.format("%.2f", result);
                    text.setText(answer);
                }

                else if(operations == "/")
                {
                    result = firstNum / secondNum;
                    answer = String.format("%.2f", result);
                    text.setText(answer);
                }
                else if(operations == "%")
                {
                    result = firstNum % secondNum;
                    answer = String.format("%.2f", result);
                    text.setText(answer);
                }
                else if(operations == "Mod")
                {
                    result = firstNum % secondNum;
                    answer = String.format("%.2f", result);
                    text.setText(answer);
                }
           		
           	  }});
              getContentPane().add(Begale);
              /*Button du Plus*/
              Badd = new JButton(" + ");
              Badd.setBorder(null);
              Badd.setForeground(new Color(255, 255, 255));
              Badd.setBackground(new Color(0, 128, 128));
              Badd.setAlignmentX(Component.RIGHT_ALIGNMENT);
              Badd.setMargin(new Insets(2, 14, 0, 14));
              Badd.setBounds(209,238,62,35);
              Badd.addActionListener(new ActionListener()
              {
           	  public void actionPerformed(ActionEvent e)
           	  {
           		firstNum = Double.parseDouble(text.getText());
                text.setText("");
                operations = "+";
           	  }});
              getContentPane().add(Badd);
              /*Button du Sous*/
              Bsous = new JButton(" - ");
              Bsous.setBorder(null);
              Bsous.setForeground(new Color(255, 255, 255));
              Bsous.setBackground(new Color(0, 128, 128));
              Bsous.setAlignmentX(1.0f);
              Bsous.setBounds(209,200,62,35);
              Bsous.addActionListener(new ActionListener()
              {
           	  public void actionPerformed(ActionEvent e)
           	  {
           		firstNum = Double.parseDouble(text.getText());
                text.setText("");
                operations = "-";
           	  }});
              getContentPane().add(Bsous);
              /*Button du Div*/
              Bdiv = new JButton("÷");
              Bdiv.setBorder(null);
              Bdiv.setForeground(new Color(255, 255, 255));
              Bdiv.setBackground(new Color(0, 139, 139));
              Bdiv.setBounds(12,162,62,35);
              Bdiv.addActionListener(new ActionListener()
              {
           	  public void actionPerformed(ActionEvent e)
           	  {
           		firstNum = Double.parseDouble(text.getText());
                text.setText("");
                operations = "/";  
           	  }});
              getContentPane().add(Bdiv);
              /*Button du Multi*/
              Bmulti = new JButton("x");
              Bmulti.setBorder(null);
              Bmulti.setForeground(new Color(255, 255, 255));
              Bmulti.setBackground(new Color(0, 128, 128));
              Bmulti.setBounds(145,162,62,35);
              Bmulti.addActionListener(new ActionListener()
              {
           	  public void actionPerformed(ActionEvent e)
           	  {
           		firstNum = Double.parseDouble(text.getText());
                text.setText("");
                operations = "*";
           		  
           	  }});
              getContentPane().add(Bmulti);
              /*Button d'effacer*/
              Bclear = new JButton("DEL");
              Bclear.setForeground(new Color(255, 255, 255));
              Bclear.setBackground(new Color(255, 0, 0));
              Bclear.setBorder(null);
              Bclear.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {

                      String backSpace = null;
                      if(text.getText().length() > 0)
                      {
                          StringBuilder strB = new StringBuilder(text.getText());
                          strB.deleteCharAt(text.getText().length() - 1);
                          backSpace = strB.toString();
                          text.setText(backSpace);

                      }

                  }
              });
              Bclear.setFont(new Font("Ubuntu", Font.BOLD, 15));
              Bclear.setBounds(145, 124, 62, 35);
              getContentPane().add(Bclear);
              /*Button du Suppression*/
              JButton btnC = new JButton("C");
              btnC.setBackground(new Color(255, 0, 0));
              btnC.setForeground(new Color(255, 255, 255));
              btnC.setBorder(null);
              btnC.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {

                     text.setText(null);

                  }
              });
              btnC.setName("");
              btnC.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnC.setBounds(209, 124, 62, 35);
              getContentPane().add(btnC);
              /*Button du Point*/
              JButton Point = new JButton(".");
              Point.setForeground(new Color(255, 255, 255));
              Point.setBorder(null);
              Point.setBackground(new Color(112, 128, 144));
              Point.setBounds(145, 318, 62, 35);
              getContentPane().add(Point);
              /*Button du inverse*/
              btnx = new JButton("1/x");
              btnx.setBorder(null);
              btnx.setBackground(new Color(0, 128, 128));
              btnx.setForeground(new Color(255, 255, 255));
              btnx.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              	  double ops = Double.parseDouble(String.valueOf(text.getText()));
                  ops = 1 / ops ;
                  text.setText(String.valueOf(ops));
              	}
              });
              btnx.setBounds(486, 162, 62, 35);
              getContentPane().add(btnx);
              /*Button du Tan*/
              Bracine_1 = new JButton("Tan");
              Bracine_1.setBorder(null);
              Bracine_1.setBackground(new Color(0, 128, 128));
              Bracine_1.setForeground(new Color(255, 255, 255));
              Bracine_1.setFont(new Font("Ubuntu", Font.BOLD, 15));
              Bracine_1.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		 double ops = Double.parseDouble(String.valueOf(text.getText()));
                     ops = Math.tan(ops);
                     text.setText(String.valueOf(ops));
              	}
              });
              Bracine_1.setBounds(288, 200, 62, 35);
              getContentPane().add(Bracine_1);
              /*Button du Sin*/
              Bracine_2 = new JButton("Sin");
              Bracine_2.setForeground(new Color(255, 255, 255));
              Bracine_2.setBorder(null);
              Bracine_2.setBackground(new Color(0, 128, 128));
              Bracine_2.setFont(new Font("Ubuntu", Font.BOLD, 15));
              Bracine_2.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {

                    double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.sin(ops);
                    text.setText(String.valueOf(ops));

              	}
              });
              Bracine_2.setBounds(288, 278, 62, 35);
              getContentPane().add(Bracine_2);
              /*Button du Cos*/
              btnCos = new JButton("Cos");
              btnCos.setForeground(new Color(255, 255, 255));
              btnCos.setBorder(null);
              btnCos.setBackground(new Color(0, 128, 128));
              btnCos.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnCos.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.cos(ops);
                    text.setText(String.valueOf(ops));
              	}
              });
              btnCos.setBounds(288, 239, 62, 35);
              getContentPane().add(btnCos);
              /*Button du Log*/
              btnLog = new JButton("Log");
              btnLog.setForeground(new Color(255, 255, 255));
              btnLog.setBorder(null);
              btnLog.setBackground(new Color(0, 128, 128));
              btnLog.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnLog.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.log(ops);
                    text.setText(String.valueOf(ops));
              	}
              });
              btnLog.setBounds(419, 239, 62, 35);
              getContentPane().add(btnLog);
              /*Button du ln*/
              btnLn = new JButton("Ln");
              btnLn.setForeground(new Color(255, 255, 255));
              btnLn.setBorder(null);
              btnLn.setBackground(new Color(0, 128, 128));
              btnLn.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnLn.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.log10(ops);
                    text.setText(String.valueOf(ops));
              	}
              });
              btnLn.setBounds(419, 278, 62, 35);
              getContentPane().add(btnLn);
              /*Button du Pi*/
              btnua = new JButton("\u03C0");
              btnua.setBorder(null);
              btnua.setBackground(new Color(0, 128, 128));
              btnua.setForeground(new Color(255, 255, 255));
              btnua.setFont(new Font("Dialog", Font.BOLD, 11));
              btnua.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              	
              	  double ops;
                  ops = (3.1415926535897932384626433832795);
                  text.setText(String.valueOf(ops));
              	}
              });
              btnua.setBounds(419, 163, 62, 35);
              getContentPane().add(btnua);
              /*Button du modulo*/
              btnx_1 = new JButton("%");
              btnx_1.setBorder(null);
              btnx_1.setForeground(new Color(255, 255, 255));
              btnx_1.setBackground(new Color(0, 139, 139));
              btnx_1.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		firstNum = Double.parseDouble(text.getText());
                    text.setText("");
                    operations = "%";
              	}
              	
              });
              btnx_1.setBounds(209, 162, 62, 35);
              getContentPane().add(btnx_1);
              /*Button du négative*/
              btnx_2 = new JButton("+/-");
              btnx_2.setForeground(new Color(255, 255, 255));
              btnx_2.setBackground(new Color(0, 128, 128));
              btnx_2.setBorder(null);
              btnx_2.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		 double ops = Double.parseDouble(String.valueOf(text.getText()));
                     ops = ops * (-1);
                     text.setText(String.valueOf(ops));
              	}
              });
              btnx_2.setBounds(78, 162, 62, 35);
              getContentPane().add(btnx_2);
              /*Button du Exp*/
              btnExp = new JButton("Exp");
              btnExp.setBorder(null);
              btnExp.setBackground(new Color(0, 128, 128));
              btnExp.setForeground(new Color(255, 255, 255));
              btnExp.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnExp.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		firstNum = Double.parseDouble(text.getText());
                    text.setText("");
                    operations = "Exp";
              	}
              });
              btnExp.setBounds(419, 200, 62, 35);
              getContentPane().add(btnExp);
              /*Button du puissance*/
              btnXy = new JButton("x^y");
              btnXy.setForeground(new Color(255, 255, 255));
              btnXy.setBorder(null);
              btnXy.setBackground(new Color(0, 128, 128));
              btnXy.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnXy.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.pow(ops, ops);
                    text.setText(String.valueOf(ops));
              	}
              });
              btnXy.setBounds(486, 278, 62, 35);
              getContentPane().add(btnXy);
              /*Button du Puissance 2*/
              btnX = new JButton("x²");
              btnX.setBorder(null);
              btnX.setBackground(new Color(0, 128, 128));
              btnX.setForeground(new Color(255, 255, 255));
              btnX.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		 double ops = Double.parseDouble(String.valueOf(text.getText()));
                     ops = (ops * ops);
                     text.setText(String.valueOf(ops));
              	}
              });
              btnX.setBounds(486, 200, 62, 35);
              getContentPane().add(btnX);
              /*Button du Puissance 3*/
              btnX_1 = new JButton("x^3");
              btnX_1.setForeground(new Color(255, 255, 255));
              btnX_1.setBorder(null);
              btnX_1.setBackground(new Color(0, 128, 128));
              btnX_1.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnX_1.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		 double ops = Double.parseDouble(String.valueOf(text.getText()));
                     ops = Math.pow(ops, 3);
                     text.setText(String.valueOf(ops));
              	}
              });
              btnX_1.setBounds(486, 239, 62, 35);
              getContentPane().add(btnX_1);
              /*Button du Sinh*/
              btnSinh = new JButton("Sinh");
              btnSinh.setForeground(new Color(255, 255, 255));
              btnSinh.setBorder(null);
              btnSinh.setBackground(new Color(0, 128, 128));
              btnSinh.setFont(new Font("Ubuntu", Font.BOLD, 12));
              btnSinh.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.sinh(ops);
                    text.setText(String.valueOf(ops));
              	}
              });
              btnSinh.setBounds(354, 278, 62, 35);
              getContentPane().add(btnSinh);
              /*Button du Cosh*/
              btnCosh = new JButton("Cosh");
              btnCosh.setForeground(new Color(255, 255, 255));
              btnCosh.setBorder(null);
              btnCosh.setBackground(new Color(0, 128, 128));
              btnCosh.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.cosh(ops);
                    text.setText(String.valueOf(ops));
              	}
              });
              btnCosh.setBounds(354, 240, 62, 35);
              btnCosh.setFont(new Font("Ubuntu", Font.BOLD, 12));
              getContentPane().add(btnCosh);
              /*Button du Tanh*/
              Bracine_3 = new JButton("Tanh");
              Bracine_3.setBorder(null);
              Bracine_3.setBackground(new Color(0, 128, 128));
              Bracine_3.setForeground(new Color(255, 255, 255));
              Bracine_3.setFont(new Font("Ubuntu", Font.BOLD, 12));
              Bracine_3.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		 double ops = Double.parseDouble(String.valueOf(text.getText()));
                     ops = Math.tanh(ops);
                     text.setText(String.valueOf(ops));
              	}
              });
              Bracine_3.setBounds(354, 200, 62, 35);
              getContentPane().add(Bracine_3);
              /*Button du CBR*/
              btnExp_1 = new JButton("Cbr");
              btnExp_1.setForeground(new Color(255, 255, 255));
              btnExp_1.setBackground(new Color(0, 128, 128));
              btnExp_1.setBorder(null);
              btnExp_1.setAlignmentX(Component.CENTER_ALIGNMENT);
              btnExp_1.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnExp_1.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              	  double ops = Double.parseDouble(String.valueOf(text.getText()));
                  ops = Math.cbrt(ops);
                  text.setText(String.valueOf(ops));
              	}
              });
              btnExp_1.setBounds(354, 318, 62, 35);
              getContentPane().add(btnExp_1);
              /*Button du Rund*/
              Bracine_4 = new JButton("Rund");
              Bracine_4.setBorder(null);
              Bracine_4.setBackground(new Color(0, 128, 128));
              Bracine_4.setForeground(new Color(255, 255, 255));
              Bracine_4.setFont(new Font("Ubuntu", Font.BOLD, 11));
              Bracine_4.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {

                    double ops = Double.parseDouble(String.valueOf(text.getText()));
                    ops = Math.round(ops);
                    text.setText(String.valueOf(ops));
              	}
              });
              Bracine_4.setBounds(288, 163, 62, 35);
              getContentPane().add(Bracine_4);
              /*Button du Nombre mod*/
              btnMod = new JButton("Mod");
              btnMod.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		 firstNum = Double.parseDouble(text.getText());
                     text.setText("");
                     operations = "Mod";
              	}
              });
              btnMod.setForeground(new Color(255, 255, 255));
              btnMod.setBackground(new Color(0, 128, 128));
              btnMod.setBorder(null);
              btnMod.setFont(new Font("Ubuntu", Font.BOLD, 12));
              btnMod.setBounds(288, 318, 62, 35);
              getContentPane().add(btnMod);
              /*Button du Binaire*/
              Bracine_5 = new JButton("Bin");
              Bracine_5.setBorder(null);
              Bracine_5.setBackground(new Color(0, 128, 128));
              Bracine_5.setForeground(new Color(255, 255, 255));
              Bracine_5.setAlignmentX(Component.CENTER_ALIGNMENT);
              Bracine_5.setFont(new Font("Ubuntu", Font.BOLD, 15));
              Bracine_5.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		int a = Integer.parseInt(text.getText());//Binary
                    text.setText(Integer.toString(a, 2));
              	}
              });
              Bracine_5.setBounds(288, 125, 62, 35);
              getContentPane().add(Bracine_5);
              /*Butto du Octale*/
              Bracine_6 = new JButton("Oct");
              Bracine_6.setBorder(null);
              Bracine_6.setBackground(new Color(0, 128, 128));
              Bracine_6.setForeground(new Color(255, 255, 255));
              Bracine_6.setAlignmentX(Component.CENTER_ALIGNMENT);
              Bracine_6.setFont(new Font("Ubuntu", Font.BOLD, 15));
              Bracine_6.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {

                    int a = Integer.parseInt(text.getText());//Binary
                    text.setText(Integer.toString(a, 8));
              	}
              });
              Bracine_6.setBounds(354, 125, 62, 35);
              getContentPane().add(Bracine_6);
              /*Button du Hexadecimale*/
              Bracine_7 = new JButton("Hex");
              Bracine_7.setBorder(null);
              Bracine_7.setBackground(new Color(0, 128, 128));
              Bracine_7.setForeground(new Color(255, 255, 255));
              Bracine_7.setAlignmentX(Component.CENTER_ALIGNMENT);
              Bracine_7.setFont(new Font("Ubuntu", Font.BOLD, 15));
              Bracine_7.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              	   int a = Integer.parseInt(text.getText());//Binary
                   text.setText(Integer.toString(a, 16));
              	}
              });
              Bracine_7.setBounds(419, 125, 62, 35);
              getContentPane().add(Bracine_7);
              /*Button Quitter*/
              btnOff = new JButton("Off");
              btnOff.setForeground(new Color(255, 255, 255));
              btnOff.setBackground(new Color(139, 0, 0));
              btnOff.setHorizontalTextPosition(SwingConstants.CENTER);
              btnOff.setMnemonic(KeyEvent.VK_ENTER);
              btnOff.setDoubleBuffered(true);
              btnOff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
              btnOff.setBorderPainted(false);
              btnOff.setAlignmentY(Component.BOTTOM_ALIGNMENT);
              btnOff.setAlignmentX(Component.RIGHT_ALIGNMENT);
              btnOff.setBorder(null);
              btnOff.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		System.exit(0);
              	}
              });
              btnOff.setName("");
              btnOff.setFont(new Font("Ubuntu", Font.BOLD, 20));
              btnOff.setBounds(12, 124, 62, 35);
              getContentPane().add(btnOff);
              /*Button pour calculer 2PI */
              JButton btnua_1 = new JButton("2*π");
              btnua_1.setBorder(null);
              btnua_1.setBackground(new Color(0, 128, 128));
              btnua_1.setForeground(new Color(255, 255, 255));
              btnua_1.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		double ops;
                    ops = (3.1415926535897932384626433832795)*2;
                    text.setText(String.valueOf(ops));
              	}
              	
              });
              btnua_1.setFont(new Font("Dialog", Font.BOLD, 11));
              btnua_1.setBounds(354, 163, 62, 35);
              getContentPane().add(btnua_1);
              /*Button Pour supprimer le contenu de Jtext*/
              btnCe = new JButton("CE");
              btnCe.setForeground(new Color(255, 255, 255));
              btnCe.setBackground(new Color(0, 128, 128));
              btnCe.setBorder(null);
              btnCe.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              		text.setText(null);
              	}
              });
              btnCe.setFont(new Font("Ubuntu", Font.BOLD, 12));
              btnCe.setBounds(419, 318, 62, 35);
              getContentPane().add(btnCe);
              /*Button pour Changer à Calucule Scientifique*/
              btnSci = new JButton("SCI");
              btnSci.setBackground(new Color(0, 128, 128));
              btnSci.setForeground(new Color(255, 255, 255));
              btnSci.setBorder(null);
              btnSci.setFont(new Font("Ubuntu", Font.BOLD, 15));
              btnSci.setBounds(78, 124, 62, 35);
              getContentPane().add(btnSci);
              
              btnCe_1 = new JButton("Ans");
              btnCe_1.addActionListener(new ActionListener() {
              	public void actionPerformed(ActionEvent e) {
              	}
              });
              btnCe_1.setForeground(Color.WHITE);
              btnCe_1.setFont(new Font("Ubuntu", Font.BOLD, 12));
              btnCe_1.setBorder(null);
              btnCe_1.setBackground(new Color(0, 128, 128));
              btnCe_1.setBounds(486, 318, 62, 35);
              getContentPane().add(btnCe_1);
          }
}
