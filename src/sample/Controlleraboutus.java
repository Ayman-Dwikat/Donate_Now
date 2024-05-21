package sample;

import java.awt.*;
import java.net.URI;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import oracle.jdbc.driver.OracleDriver;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;

public class Controlleraboutus {
    @FXML
    private Button home;
    @FXML
    private Button donate;
    @FXML
    private Button donatemoney;
    @FXML
    private Button Donlist;
    @FXML
    private Button Achivments;
    @FXML
    private Button about;
    @FXML
    private Button logout;
    @FXML
    private TextArea TXT;

    @FXML
    void Gohome(ActionEvent e) throws IOException {
        if (e.getSource() == home) {
            Stage stage = (Stage) home.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("welcome.fxml"));
            primaryStage.setTitle("Together we can");
            Image image = new Image(("sample/give-love.png"));
            primaryStage.getIcons().add(image);
            Scene scene = new Scene(root, 782, 790);
            primaryStage.setScene(scene);
            primaryStage.show();
            scene.getStylesheets().add(getClass().getResource("welcome.css").toExternalForm());
        }
    }

    @FXML
    void GoDonate(ActionEvent e) throws IOException {
        if (e.getSource() == donate) {
            Stage stage = (Stage) donate.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("Donate.fxml"));
            primaryStage.setTitle("Together we can");
            Image image = new Image(("sample/give-love.png"));
            primaryStage.getIcons().add(image);
            Scene scene = new Scene(root, 782, 790);
            primaryStage.setScene(scene);
            primaryStage.show();
            scene.getStylesheets().add(getClass().getResource("Donate.css").toExternalForm());
        }
    }

    @FXML
    void Golist(ActionEvent e) throws IOException {
        if (e.getSource() == Donlist) {
            Stage stage = (Stage) Donlist.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
            primaryStage.setTitle("Together we can");
            Image image = new Image(("sample/give-love.png"));
            primaryStage.getIcons().add(image);
            Scene scene = new Scene(root, 882, 790);
            primaryStage.setScene(scene);
            primaryStage.show();
            scene.getStylesheets().add(getClass().getResource("list.css").toExternalForm());
        }
    }

    @FXML
    void GoDonateMoney(ActionEvent e) throws IOException {
        if (e.getSource() == donatemoney) {
            Stage stage = (Stage) donatemoney.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("DonateMoney.css"));
            primaryStage.setTitle("Together we can");
            Image image = new Image(("sample/give-love.png"));
            primaryStage.getIcons().add(image);
            Scene scene = new Scene(root, 782, 790);
            primaryStage.setScene(scene);
            primaryStage.show();
            scene.getStylesheets().add(getClass().getResource("DonateMoney.css").toExternalForm());
        }
    }

    @FXML
    void Goachivments(ActionEvent e) throws IOException {
        if (e.getSource() == Achivments) {
            Stage stage = (Stage) Achivments.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("achivments.fxml"));
            primaryStage.setTitle("Together we can");
            Image image = new Image(("sample/give-love.png"));
            primaryStage.getIcons().add(image);
            Scene scene = new Scene(root, 782, 790);
            primaryStage.setScene(scene);
            primaryStage.show();
            scene.getStylesheets().add(getClass().getResource("achivments.css").toExternalForm());
        }
    }

    @FXML
    void Log_Out(ActionEvent e) throws IOException {
        if (e.getSource() == logout) {
            Stage stage = (Stage) logout.getScene().getWindow();
            stage.close();
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Together we can");
            Image image = new Image(("sample/give-love.png"));
            primaryStage.getIcons().add(image);
            Scene scene = new Scene(root, 882, 790);
            primaryStage.setScene(scene);
            primaryStage.show();
            scene.getStylesheets().add(getClass().getResource("Main.css").toExternalForm());
        }
    }

    @FXML
    private Button vidio;
    @FXML
    public void showvid(ActionEvent e){
        try {
            Desktop.getDesktop().browse(new URI("https://drive.google.com/file/d/1oCmaEoBumAJTUqDECL1_x1ME-58xhD6N/view?usp=sharing"));
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (URISyntaxException e1) {
            e1.printStackTrace();
        }
    }
}