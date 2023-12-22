package day6.Abstract_practic.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadSeqFile extends Frame implements ActionListener {
    private TextField account, name, balance;
    private Button next, done;
    private DataInputStream input; //필드에 입력된 account, name, balance 의 String 객체를 담는 객체

    public ReadSeqFile() {
        super("고객 파일을 읽겠습니다.");
    /*    try {
            input = new DataInputStream(new FileInputStream("client.doc"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e1) {
            System.err.println(e1.toString());
            System.exit(1);
        }*/
        setSize(250, 150);
        setLayout(new GridLayout(4, 2));
        add(new Label("account"));
        account = new TextField();
        account.setEditable(false); // read Only
        add(account);


        add(new Label("name"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        //balance Frame에 붙이기
        add(new Label("balance"));
        balance = new TextField();
        balance.setEditable(false);
        add(balance);

        done = new Button("exit");
        done.addActionListener(this);
        add(done);

        next = new Button("print");
        next.addActionListener(this);
        add(next);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) readRecord();    // 데이터를 한 레코드씩 읽는 메소드
        else closeFile();
    }

    public void closeFile() {
        System.exit(1);
    }

    public void readRecord() {
    }

    public static void main(String[] args) {
        new ReadSeqFile();

    }
}