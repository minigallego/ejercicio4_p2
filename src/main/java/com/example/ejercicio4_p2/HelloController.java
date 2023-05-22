package com.example.ejercicio4_p2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.Collections;

public class HelloController {
    public GridPane gridpane;
    public Pane imgpane;
    public Button nuevapartida;
    public TextArea textarea;
    public ImageView imgview;
    private puzzle juego=new puzzle(4,4);

    public void initialize(){
        gridpane.getChildren().clear();
        Image imagen=new Image(getClass().getResourceAsStream("/imagenes/miniatura.jpg"));
        imgview.setImage(imagen);
        ArrayList<Integer> numImagenes=juego.Desordenar();
        for (int i = 0; i < numImagenes.size(); i++) {
            gridpane.add(createImage(numImagenes.get(i)),i%4, i/4);
        }
    }
    private ImageView createImage(int num){
        Image image=new Image(getClass().getResourceAsStream("/imagenes/Estatua_"+num+".jpg"));
        ImageView img=new ImageView(image);
        img.setFitHeight(159);
        img.setFitWidth(119);
        img.setOnDragDetected(this:: Imagenclick);
        return img;
    }

    private void Imagenclick(MouseEvent mouseEvent) {
        ImageView imagen =(ImageView) mouseEvent.getSource();
        Image img=imagen.getImage();
        Integer colIndex = gridpane.getColumnIndex(imagen);
        Integer rowIndex=gridpane.getRowIndex(imagen);
        Image ima=new Image(getClass().getResourceAsStream("/imagenes/Estatua_16.jpg"));
        Integer colNegro= gridpane.;

    }

    public void onnuevapartida(ActionEvent actionEvent) {

    }
}