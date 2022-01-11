package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import static javax.swing.JOptionPane.showMessageDialog;

public class hotel extends JFrame
{
    JMenu menu, submenu;
    JMenuItem i1, i2, i3,i4;

    List<Object> lista_kl = new ArrayList<>();
    List<Object> lista_V = new ArrayList<>();

    bazaklienci test1=new bazaklienci("imie","nazwisko",1);
    bazaklienci test2=new bazaklienci("imie","nazwisko",3);

    bazavip test3=new bazavip("imie","nazwisko",3);
    hotel(){
        JFrame f= new JFrame("Hotel");
        JMenuBar mb=new JMenuBar();
        menu=new JMenu("Menu");
        submenu=new JMenu("Sub");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        i1=new JMenuItem("klienci");
        i2=new JMenuItem("pokoje");
        i3=new JMenuItem("zapis i odczyt");

        i4=new JMenuItem("finanse");

        menu.add(i1); menu.add(i2); menu.add(i3);
        menu.add(i4);
        menu.add(submenu);
        mb.add(menu);
        f.setJMenuBar(mb);
        f.setSize(500,500);
        setLayout(null);
        f.setVisible(true);
        setLocationRelativeTo(null);
        JPanel pokoj =new JPanel();
        JPanel finanse = new JPanel();
        JLabel label_czynsz = new JLabel("łączny czynsz");
        JLabel label_dni = new JLabel("ilość dni");
        JLabel label_dochod = new JLabel("czynsz po dniach");
        JLabel spacer6 = new JLabel();
        JLabel spacer7 = new JLabel();
        JTextField czynsz= new JTextField();

        JTextField dni= new JTextField();

        JTextField dochod= new JTextField();

        JButton button_oblicz = new JButton("oblicz");
        finanse.add(label_czynsz);
        finanse.add(label_dni);
        finanse.add(label_dochod);
        finanse.add(spacer6);
        finanse.add(czynsz);
        finanse.add(dni);
        finanse.add(dochod);
        finanse.add(spacer7);
        finanse.add(button_oblicz);
        JPanel klient = new JPanel();
        JLabel spacer=new JLabel();
        JRadioButton vip = new JRadioButton("pokoj specjalny ");
        JRadioButton nvip=new JRadioButton("pokoj zwykly");
        JLabel spacer2= new JLabel();
        JLabel akapit = new JLabel();
        klient.add(akapit);


        JButton button_zapisz = new JButton("zapisz");
        JButton button_wczytaj = new JButton("wczytaj");



        JTextField path = new JTextField();
        JButton klient_usun =new JButton("usun");
        JCheckBox check_normal=new JCheckBox("normalny");
        JCheckBox check_special = new JCheckBox("specialny");
        JLabel imm=new JLabel("        imie");
        JLabel nzz=new JLabel("    nazwisko");
        JLabel nrpokj=new JLabel("numer pokoju ");
        klient.setBounds(0,0,400,400);
        JButton klienci_dodaj = new JButton("dodaj");


        DefaultListModel<String> dlm = new DefaultListModel<String>();
        JList<String>  lista_klient = new JList<>(dlm);
        DefaultListModel<String> dlm3 = new DefaultListModel<String>();
        JList<String>  lista_pokoje = new JList<>(dlm3);
        DefaultListModel<String> dlm2 = new DefaultListModel<String>();
        DefaultListModel<String> dlm4 = new DefaultListModel<String>();
        JTextField wyswietlpokojevip=new JTextField();
        JTextField wyswietlpokojezwykle=new JTextField();
        JLabel spacer4= new JLabel();
        JTextField TF_imie=new JTextField();
        JTextField TF_nazwisko=new JTextField();
        JTextField TF_nrpokoju=new JTextField();
        JLabel spacer5=new JLabel();
        pokoj.add(wyswietlpokojevip);
        pokoj.add(spacer5);
        pokoj.add(wyswietlpokojezwykle);
        pokoj.add(spacer4);
        pokoj.add(vip);
        pokoj.add(spacer);
        pokoj.add(nvip);
        pokoj.add(spacer2);
        pokoj.add(lista_pokoje);

        klient.add(klient_usun);
        klient.add(imm);
        klient.add(nzz);
        klient.add(nrpokj);
        klient.add(klienci_dodaj);
        klient.add(TF_imie);
        klient.add(TF_nazwisko);
        klient.add(TF_nrpokoju);

        klient.add(spacer);
        klient.add(check_normal);
        klient.add(check_special);

        klient.add(spacer2);
        klient.add(lista_klient);
        path.setPreferredSize(new Dimension(440,24));
        akapit.setPreferredSize( new Dimension( 20, 24 ) );
        imm.setPreferredSize( new Dimension( 100, 24 ) );
        nzz.setPreferredSize( new Dimension( 100, 24 ) );
        nrpokj.setPreferredSize( new Dimension( 120, 24 ) );
        lista_klient.setPreferredSize( new Dimension( 300, 300 ) );
        lista_pokoje.setPreferredSize( new Dimension( 300, 300 ) );
        TF_imie.setPreferredSize( new Dimension( 100, 24 ) );
        TF_nazwisko.setPreferredSize( new Dimension( 100, 24 ) );
        TF_nrpokoju.setPreferredSize( new Dimension( 100, 24 ) );
        spacer.setPreferredSize(new Dimension( 10000, 20 ));
        spacer2.setPreferredSize(new Dimension( 10000, 20 ));
        czynsz.setPreferredSize( new Dimension( 100, 24 ) );
        dni.setPreferredSize( new Dimension( 100, 24 ) );
        dochod.setPreferredSize( new Dimension( 100, 24 ) );
        button_oblicz.setPreferredSize( new Dimension( 100, 24 ) );
       wyswietlpokojevip.setPreferredSize( new Dimension( 24, 24 ) );
        spacer4.setPreferredSize(new Dimension( 10000, 2 ));
        spacer5.setPreferredSize(new Dimension( 100, 24 ));
        spacer6.setPreferredSize(new Dimension( 10000, 6 ));
        label_czynsz.setPreferredSize(new Dimension( 100, 24  ));
        label_dni.setPreferredSize(new Dimension( 100, 24 ));
        label_dochod.setPreferredSize(new Dimension( 100, 24 ));
        spacer7.setPreferredSize(new Dimension( 10000, 12 ));

        wyswietlpokojezwykle.setPreferredSize( new Dimension( 24, 24 ) );


        JPanel zapis = new JPanel();
        zapis.add(path);
        zapis.add(button_zapisz);
        zapis.add(button_wczytaj);


        boolean []tabn=new boolean [20];
        for(int i=0;i<tabn.length;i++){
            tabn[i]=true;
        }
        boolean []tabs=new boolean [10];
        for(int i=0;i< tabs.length;i++){
            tabs[i]=true;
        }

        lista_kl.add(test1);

        lista_kl.add(test2);

        lista_V.add(test3);

        for(int i=0;i<lista_kl.size();i++) {
            dlm.addElement(lista_kl.get(i).toString());

            String s = dlm.getElementAt(i).toString();

            Matcher matcher = Pattern.compile("\\d+").matcher(s);
            matcher.find();
            int z = Integer.valueOf(matcher.group());
             tabn[z]=false;

        }
        for(int i=0;i<lista_V.size();i++) {
            dlm2.addElement(lista_V.get(i).toString());

            String s = dlm2.getElementAt(i).toString();

            Matcher matcher = Pattern.compile("\\d+").matcher(s);
            matcher.find();
            int z = Integer.valueOf(matcher.group());

            tabs[z]=false;

        }

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object select = e.getSource();

                int npokoje = 20;
                int spokoje = 10;
                if (select == i1) {
                    f.add(klient);
                    f.remove(finanse);
                    f.remove(pokoj);

                    f.remove(zapis);
                    f.revalidate();
                    f.repaint();


                } else if (select == i2) {
                    f.add(pokoj);
                    f.remove(finanse);
                    f.remove(klient);
                    f.remove(zapis);
                    f.revalidate();
                    f.repaint();

                    wyswietlpokojezwykle.setText("" + (npokoje - dlm.getSize()));

                    wyswietlpokojevip.setText("" + (spokoje - dlm2.getSize()));

                    dlm3.removeAllElements();
                    for (int i = 0; i < tabn.length; i++) {
                        if (tabn[i] == true) {
                            dlm3.addElement(i + " wolne");
                        } else {
                            dlm3.addElement(i + " zajete");
                        }
                    }
                } else if (select == i3) {
                    f.add(zapis);
                    f.remove(klient);
                    f.remove(pokoj);
                    f.remove(finanse);
                    f.revalidate();
                    f.repaint();


                } else if (select == i4) {
                    f.add(finanse);
                    f.remove(klient);
                    f.remove(pokoj);
                    f.remove(zapis);

                    f.revalidate();
                    f.repaint();
                }
                if (select == check_special) {
                    lista_klient.setModel(dlm2);

                    lista_pokoje.setModel(dlm4);
                }

                if (select == check_normal) {
                    lista_klient.setModel(dlm);

                    lista_pokoje.setModel(dlm3);
                }
                if (select == vip) {
                    lista_pokoje.setModel(dlm4);
                    lista_klient.setModel(dlm2);

                }
                if (select == nvip) {
                    lista_pokoje.setModel(dlm3);
                    lista_klient.setModel(dlm);

                }
                czynsz.setText("" + (dlm.getSize() * 150 + dlm2.getSize() * 300));
                if (select == button_oblicz) {
                    int a = Integer.parseInt(czynsz.getText());
                    int b = Integer.parseInt(dni.getText());
                    dochod.setText("" + (a * b));

                }

                if (select == button_zapisz) {


                    String sciezka = path.getText();

                    try {
                        File myObj = new File(sciezka + "listazwykla");
                        File myObj2 = new File(sciezka + "listaspecjalna");

                        if (myObj.createNewFile()) {
                            System.out.println("File created: " + myObj.getName());
                            lista_klient.setModel(dlm);
                            ListModel model = lista_klient.getModel();
                            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(myObj), "UTF-8"));

                            try {
                                int len = model.getSize();


                                for (int i = 0; i < len; i++) {
                                    pw.println(model.getElementAt(i).toString());
                                }


                            } finally {
                                pw.close();
                            }
                        }
                        if (myObj2.createNewFile()) {
                            System.out.println("File created: " + myObj2.getName());
                            lista_klient.setModel(dlm2);
                            ListModel model = lista_klient.getModel();
                            PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(myObj2), "UTF-8"));

                            try {
                                int len = model.getSize();


                                for (int i = 0; i < len; i++) {
                                    pw.println(model.getElementAt(i).toString());
                                }

                            } finally {
                                pw.close();
                            }


                        } else {
                            System.out.println("File already exists.");
                        }
                    } catch (IOException o) {
                        System.out.println("An error occurred.");

                    }
                }


                if (select == button_wczytaj) {
                    BufferedReader br = null;
                    String sciezka = path.getText();
                    dlm.removeAllElements();
                    dlm2.removeAllElements();
                    try {
                        br = new BufferedReader(new FileReader(sciezka + "listazwykla"));


                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    String line = null;
                    while (true) {
                        try {
                            if (!((line = br.readLine()) != null)) break;
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        if (line == "") break;
                        String s = line;
                        System.out.println(s);
                        Matcher matcher = Pattern.compile("\\d+").matcher(s);
                        matcher.find();
                        int i = Integer.valueOf(matcher.group());

                        tabn[i] = false;
                        dlm.addElement(line);

                    }
                    try {
                        br = new BufferedReader(new FileReader(sciezka + "listaspecjalna"));
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    line = null;
                    while (true) {
                        try {
                            if (!((line = br.readLine()) != null)) break;
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        if (line == "") break;
                        String s = line;

                        Matcher matcher = Pattern.compile("\\d+").matcher(s);
                        matcher.find();
                        int i = Integer.valueOf(matcher.group());

                        tabs[i] = false;
                        dlm2.addElement(line);
                    }


                }

                if (select == vip) {
                    nvip.setSelected(false);
                    check_normal.setSelected(false);
                    dlm4.removeAllElements();
                    for (int j = 0; j < tabs.length; j++) {
                        if (tabs[j] == true) {

                            dlm4.addElement(j + " wolne");
                        } else {
                            dlm4.addElement(j + " zajete");

                        }
                    }
                }
                if (select == nvip) {
                    vip.setSelected(false);
                    check_special.setSelected(false);
                }


                if (select == check_normal) {
                    check_special.setSelected(false);
                    vip.setSelected(false);

                } else if (select == check_special) {
                    nvip.setSelected(false);

                    check_normal.setSelected(false);

                }

                if (select == klienci_dodaj) {

                    String im = TF_imie.getText();
                    String nz = TF_nazwisko.getText();
                    int nrpok = Integer.parseInt(TF_nrpokoju.getText());
                    int s = lista_V.size();
                    int n = lista_kl.size();


                    if (im.length() > 0 && nz.length() > 0 && nrpok > 0) {
                        if (check_special.isSelected()) {
                            if (tabs[nrpok] == true) {
                                if ((10 - dlm2.getSize()) > 0) {
                                    bazavip vip = new bazavip(im, nz, nrpok);
                                    lista_V.add(vip);
                                    tabs[nrpok] = false;
                                    String info = lista_V.get(s).toString();
                                    dlm2.addElement(info);

                                } else {
                                    showMessageDialog(null, "wszystkie pokoje zajete");

                                }
                            } else {
                                showMessageDialog(null, "zajete");

                            }
                        } else {
                            if (tabn[nrpok] == true) {
                                if ((20 - dlm.getSize()) > 0) {

                                    bazaklienci klient = new bazaklienci(im, nz, nrpok);

                                    tabn[nrpok] = false;
                                    lista_kl.add(klient);
                                    String info = lista_kl.get(n).toString();
                                    dlm.addElement(info);
                                } else {
                                    showMessageDialog(null, "wszystkie pokoje zajete");

                                }
                            } else {
                                showMessageDialog(null, "zajete");

                            }
                        }
                    } else {
                        showMessageDialog(null, "uzupełnij wszystkie pola");

                    }
                }


  /*
             if(select==klient_usun){

                    if(check_special.isSelected()==true){



                        String s = dlm2.get(dlm2.size()-1);
                        System.out.println(s);
                        Matcher matcher = Pattern.compile("\\d+").matcher(s);
                        matcher.find();
                        int i = Integer.valueOf(matcher.group());
                        System.out.println(i);
                        dlm2.remove(dlm2.size()-1);
                        tabs[i]=true;
                        spokoje++;
                    }else {


                        String s = dlm.get(dlm.size()-1);
                        System.out.println(s);
                        Matcher matcher = Pattern.compile("\\d+").matcher(s);
                        matcher.find();
                        int i = Integer.valueOf(matcher.group());
                        System.out.println(i);
                        dlm.remove(dlm.size()-1);

                        tabn[i]=true;
                        npokoje++;

                    }                    }


*/


                if (select == klient_usun) {

                    int index = lista_klient.getSelectedIndex();

                    if (check_special.isSelected() == true) {

                        String s = dlm2.get(index);

                        Matcher matcher = Pattern.compile("\\d+").matcher(s);
                        matcher.find();
                        int i = Integer.valueOf(matcher.group());
                        tabs[i]=true;

                        dlm2.remove(index);

                        spokoje++;
                    } else {
                        String s = dlm.get(index);

                        Matcher matcher = Pattern.compile("\\d+").matcher(s);
                        matcher.find();
                        int i = Integer.valueOf(matcher.group());
                        tabn[i]=true;

                        dlm.remove(index);

                        npokoje++;

                    }
                }
            }

            };
        nvip.addActionListener(listener);
        vip.addActionListener(listener);
        i1.addActionListener(listener);
        i2.addActionListener(listener);
        klienci_dodaj.addActionListener(listener);
        i3.addActionListener(listener);
        button_zapisz.addActionListener(listener);
        klient_usun.addActionListener(listener);
        check_normal.addActionListener(listener);
        check_special.addActionListener(listener);
        button_wczytaj.addActionListener(listener);
        i4.addActionListener(listener);
        button_oblicz.addActionListener(listener);

    }


    public static void main(String args[])
    {

        new hotel();
        /*
        Connection con =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "1111");
            System.out.println("Połączono");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Nie udało się połączyć: " + ex);
        }
        catch(SQLException ex) {
            System.out.println("Błąd zapytania SQL: " + ex);
        }

        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {


            stmt = con.prepareStatement("SELECT * FROM klienci");
            rs = stmt.executeQuery();

        }
        catch(Exception ex) {
            System.out.println( "sprawdzKlient" + ex);
        }
    */}
}
