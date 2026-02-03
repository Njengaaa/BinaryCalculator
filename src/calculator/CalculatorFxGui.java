package calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CalculatorFxGui extends Application {

    Label txt;
    long v1 = 0;
    String op = "";
    boolean start = true;

    @Override
    public void start(Stage ps) {

        txt = new Label("0");

        txt.setFont(new Font(40));

        txt.setAlignment(Pos.CENTER_RIGHT);

        txt.setMaxWidth(Double.MAX_VALUE);

        txt.setPadding(new Insets(0, 20, 0, 0));

        Label h = new Label("HEX  0");
        Label d = new Label("DEC  0");
        Label o = new Label("OCT  0");
        Label b = new Label("BIN  0");

        VBox vb = new VBox(10);
        vb.setPadding(new Insets(12));
        vb.getChildren().addAll(txt, h, o, d, b);

        GridPane gp = new GridPane();
        gp.setHgap(5);
        gp.setVgap(5);
        gp.setPadding(new Insets(10));

        Button btnA = new Button("A");
        btnA.setPrefSize(50, 40);
        gp.add(btnA, 0, 0);

        Button btnL = new Button("<<");
        btnL.setPrefSize(50, 40);
        gp.add(btnL, 1, 0);

        Button btnR = new Button(">>");
        btnR.setPrefSize(50, 40);
        gp.add(btnR, 2, 0);

        Button btnC = new Button("C");
        btnC.setPrefSize(50, 40);
        gp.add(btnC, 3, 0);
        btnC.setOnAction(e -> {
            txt.setText("0");
            v1 = 0;
            op = "";
            start = true;
        });


        Button btnD = new Button("Del");
        btnD.setPrefSize(50, 40);
        gp.add(btnD, 4, 0);

        Button btnB = new Button("B");
        btnB.setPrefSize(50, 40);
        gp.add(btnB, 0, 1);

        Button btnBr1 = new Button("(");
        btnBr1.setPrefSize(50, 40);
        gp.add(btnBr1, 1, 1);

        Button btnBr2 = new Button(")");
        btnBr2.setPrefSize(50, 40);
        gp.add(btnBr2, 2, 1);

        Button btnMod = new Button("%");
        btnMod.setPrefSize(50, 40);
        gp.add(btnMod, 3, 1);

        Button btnDiv = new Button("/");
        btnDiv.setPrefSize(50, 40);
        btnDiv.setOnAction(e -> {
            v1 = Long.parseLong(txt.getText(), 2);
            op = "/";
            start = true;
        });
        gp.add(btnDiv, 4, 1);

        Button btnHexC = new Button("C");
        btnHexC.setPrefSize(50, 40);
        gp.add(btnHexC, 0, 2);

        Button btn7 = new Button("7");
        btn7.setPrefSize(50, 40);
        gp.add(btn7, 1, 2);

        Button btn8 = new Button("8");
        btn8.setPrefSize(50, 40);
        gp.add(btn8, 2, 2);

        Button btn9 = new Button("9");
        btn9.setPrefSize(50, 40);
        gp.add(btn9, 3, 2);

        Button btnMul = new Button("X");
        btnMul.setPrefSize(50, 40);
        btnMul.setOnAction(e -> {
            v1 = Long.parseLong(txt.getText(), 2);
            op = "X";
            start = true;
        });
        gp.add(btnMul, 4, 2);

        Button btnHexD = new Button("D");
        btnHexD.setPrefSize(50, 40);
        gp.add(btnHexD, 0, 3);

        Button btn4 = new Button("4");
        btn4.setPrefSize(50, 40);
        gp.add(btn4, 1, 3);

        Button btn5 = new Button("5");
        btn5.setPrefSize(50, 40);
        gp.add(btn5, 2, 3);

        Button btn6 = new Button("6");
        btn6.setPrefSize(50, 40);
        gp.add(btn6, 3, 3);

        Button btnSub = new Button("-");
        btnSub.setPrefSize(50, 40);
        btnSub.setOnAction(e -> {
            v1 = Long.parseLong(txt.getText(), 2);
            op = "-";
            start = true;
        });
        gp.add(btnSub, 4, 3);

        Button btnHexE = new Button("E");
        btnHexE.setPrefSize(50, 40);
        gp.add(btnHexE, 0, 4);

        Button btn1 = new Button("1");
        btn1.setPrefSize(50, 40);
        btn1.setOnAction(e -> {
            if (start) {
                txt.setText("1");
                start = false;
            } else {
                txt.setText(txt.getText() + "1");
            }
        });
        gp.add(btn1, 1, 4);

        Button btn2 = new Button("2");
        btn2.setPrefSize(50, 40);
        gp.add(btn2, 2, 4);

        Button btn3 = new Button("3");
        btn3.setPrefSize(50, 40);
        gp.add(btn3, 3, 4);

        Button btnAdd = new Button("+");
        btnAdd.setPrefSize(50, 40);
        btnAdd.setOnAction(e -> {
            v1 = Long.parseLong(txt.getText(), 2);
            op = "+";
            start = true;
        });
        gp.add(btnAdd, 4, 4);

        Button btnHexF = new Button("F");
        btnHexF.setPrefSize(50, 40);
        gp.add(btnHexF, 0, 5);

        Button btnPM = new Button("+/-");
        btnPM.setPrefSize(50, 40);
        gp.add(btnPM, 1, 5);

        Button btn0 = new Button("0");
        btn0.setPrefSize(50, 40);
        btn0.setOnAction(e -> {
            if (start) {
                txt.setText("0");
                start = false;
            } else {
                txt.setText(txt.getText() + "0");
            }
        });
        gp.add(btn0, 2, 5);

        Button btnDot = new Button(".");
        btnDot.setPrefSize(50, 40);
        gp.add(btnDot, 3, 5);

        Button btnEq = new Button("=");
        btnEq.setPrefSize(50, 40);
        btnEq.setOnAction(e -> {
            long v2 = Long.parseLong(txt.getText(), 2);
            long res = 0;
            if (op.equals("+")) res = v1 + v2;
            if (op.equals("-")) res = v1 - v2;
            if (op.equals("X")) res = v1 * v2;
            if (op.equals("/")) {
                if (v2 != 0) res = v1 / v2;
            }
            txt.setText(Long.toBinaryString(res));
            start = true;
        });
        gp.add(btnEq, 4, 5);

        BorderPane root = new BorderPane();
        root.setTop(vb);
        root.setCenter(gp);

        Scene sc = new Scene(root, 300, 450);
        ps.setTitle("Programmer");
        ps.setScene(sc);
        ps.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}