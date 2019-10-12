import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class WordGameInterface {
    public WordGameInterface() {
        setTitle("WordGame");
        BufferedImage img = ImageIO.read(new File("C:\\Users\\IT-cube\\IdeaProjects\\WordGame\\src\\cherep_kapyushon_uzhasy_1606.jpg"));
        MyImagePanel panel = new MyImagePanel(img);
        panel.setLayout(null);

        wordField = new JTextField("word");
        translationField = new JTextField("слово(перевод слова)");
        wordField.setLayout(null);
        translationField.setLayout(null);
        wordField.setBounds(100,90,200,30);
        translation.setBounds(100,130,200,30);



    }


    }