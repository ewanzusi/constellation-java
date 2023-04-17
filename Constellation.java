package assignment1_000394903;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;
import static javafx.application.Application.launch;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Emmanuel Wanzusi
 */
public class Constellation extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1600, 800); // Set canvas Size in Pixels
        stage.setTitle("Constellation"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // *** Background color
        gc.setFill(Color.MIDNIGHTBLUE); // Set background colour
        gc.fillRect(0, 0, 1600, 800); // Set area size for background colour

        // ***  Create randomly-spaced stars
        for (int starCount = 0; starCount <= 2000; starCount++) { // Create stars until starCount reaches 1000.
            double x = Math.random() * 1600; // Select random x coordinate for star
            double y = Math.random() * 800; // Select random  y coordinate for star

            double w = Math.random() * 2; // Set random width for star
            double h = Math.random() * 2; // Set random height for star

            gc.setFill(Color.WHITE); // Sets color for stars.
            gc.fillOval(x, y, w, h); // Use random x, y, w, h values to create a star.

        }

        double w = 10; // Sets the width of each star
        double h = 10; // Sets the height of each star

        gc.setFill(Color.WHITE); // Sets the color for each star.

        Scanner input = new Scanner(System.in);

        // *** Input to get number of stars from the user.
        System.out.print("Enter how many stars do you want in your constellation: ");
        int stars = input.nextInt();
        int count = 1; // Keeps count of each star entered by the user.

        // *** Gets the coordinates for the first star.
        while (stars >= count) {
            System.out.print("Enter the x coordinate for star " + count + ": ");
            int x = input.nextInt(); // Sets x coordinate for the star

            if (x > 1590) {
                do { // Asks user to input another value if the value given exceeds canvas width.
                    System.out.println("The x coordinate " + x + " provided exceeds the 1590 x value limit.");
                    System.out.print("Please re-enter a max value below 1590 for the x coordinate for star " + count + ": ");
                    x = input.nextInt();
                } while (x > 1590);
            }


            System.out.print("Enter the y coordinate for star " + count + ": ");
            int y = input.nextInt(); // Sets the y coordinate for the star.

            if (y > 790) {
                do { // Asks user to input another value if the value given exceeds canvas height.
                    System.out.println("The y coordinate " + y + " provided exceeds the 790 y value limit.");
                    System.out.print("Please re-enter a max value of 790 or below for the y coordinate for star " + count + ": ");
                    y = input.nextInt();
                } while (y > 790);
            }

            if (stars == 1){

                gc.fillOval(x - 5, y - 5, w, h); // Sets the coordinates for first star.

                // *** Gets the constellation name from user.
                System.out.print("Enter a name for your constellation: ");
                String constellation = input.next();

                // *** Prints constellation name.
                gc.setFill(Color.GOLD); // Sets colour of constellation.
                gc.setFont(new Font("System", 35)); // Sets font style and font size for constellation.
                gc.fillText(constellation, 10, 790); // Sets the coordinates for constellation name.

                // *** Prints programming credits.
                gc.setFont(new Font("System", 20)); // Sets font style and font size for authorship.
                gc.fillText("App created by: Emmanuel Wanzusi", 1280, 20); // Sets the coordinates for authorship.

                stage.show();

                return;

            }

            count++; // Increments count by 1.

            // *** Gets the coordinates for the second star.
            System.out.print("Enter the x coordinate for star " + count + ": ");
            int x2 = input.nextInt(); // Sets x coordinate for the second star.

            if (x2 > 1590) {
                do { // Asks user to input another value if the value given exceeds canvas width.
                    System.out.println("The x coordinate " + x2 + " provided exceeds the 1590 x value limit.");
                    System.out.print("Please re-enter a max value below 1590 for the x coordinate for star " + count + ": ");
                    x2 = input.nextInt();
                } while (x2 > 1590);
            }


            System.out.print("Enter the y coordinate for star " + count + ": ");
            int y2 = input.nextInt(); // Sets the y coordinate for the second star.

            if (y2 > 790) {
                do { // Asks user to input another value if the value given exceeds canvas height.
                    System.out.println("The y coordinate " + y2 + " provided exceeds the 790 y value limit.");
                    System.out.print("Please re-enter a max value of 790 or below for the y coordinate for star " + count + ": ");
                    y2 = input.nextInt();
                } while (y2 > 790);
            }

            if (stars == 2){

                gc.fillOval(x - 5, y - 5, w, h); // Sets the coordinates for first star.
                gc.fillOval(x2 - 5, y2 - 6, w, h); // Sets the coordinates for second star.

                gc.setStroke(Color.WHITE); // Set the color for the constellation line.
                gc.strokeLine(x, y, x2, y2); // Sets the coordinates for constellation line from first star to second star.

                // *** Gets the constellation name from user.
                System.out.print("Enter a name for your constellation: ");
                String constellation = input.next();

                // *** Prints constellation name.
                gc.setFill(Color.GOLD); // Sets colour of print statements.
                gc.setFont(new Font("System", 35)); // Sets font style and font size for constellation.
                gc.fillText(constellation, 10, 790); // Sets the coordinates for constellation name.

                // *** Prints programming credits.
                gc.setFont(new Font("System", 20)); // Sets font style and font size for authorship.
                gc.fillText("App created by: Emmanuel Wanzusi", 1280, 20); // Sets the coordinates for authorship.

                stage.show();

                return;

            }

            count++; // Increments count by 1.

            int x3 = 0;
            int y3 = 0;

            int x4 = 0;
            int y4 = 0;

            gc.fillOval(x - 5, y - 5, w, h); // Sets the coordinates for each star.
            gc.fillOval(x2 - 5, y2 - 6, w, h); // Sets the coordinates for second star.

            gc.setStroke(Color.WHITE); // Set the color for the constellation line.
            gc.strokeLine(x, y, x2, y2); // Sets the coordinates for constellation line from first star to second star.

            do { // Loops until number of x and y coordinates are entered for each star

                if (x3 != 0 && y3 != 0) { // Reassigns x4 and y4 coordinates with x3 and y3 coordinates

                    x3 = x4;
                    y3 = y4;

                }

                if (x3 == 0 && y3 == 0) { // Loops once to get x3 and y3 coordinates.
                    // *** Gets the coordinates for the third star.
                    System.out.print("Enter the x coordinate for star " + count + ": ");
                    x3 = input.nextInt(); // Sets x coordinate for the third star.

                    if (x3 > 1590) {
                        do { // Asks user to input another value if the value given exceeds canvas width.
                            System.out.println("The x coordinate " + x3 + " provided exceeds the 1590 x value limit.");
                            System.out.print("Please re-enter a max value below 1590 for the x coordinate for star " + count + ": ");
                            x3 = input.nextInt();
                        } while (x3 > 1590);
                    }


                    System.out.print("Enter the y coordinate for star " + count + ": ");
                    y3 = input.nextInt(); // Sets the y coordinate for third star.

                    if (y3 > 790) {
                        do { // Asks user to input another value if the value given exceeds canvas height.
                            System.out.println("The y coordinate " + y3 + " provided exceeds the 790 y value limit.");
                            System.out.print("Please re-enter a max value of 790 or below for the y coordinate for star " + count + ": ");
                            y3 = input.nextInt();
                        } while (y3 > 790);

                    }

                    if (stars == 3){

                        gc.fillOval(x - 5, y - 5, w, h); // Sets the coordinates for first star.
                        gc.fillOval(x2 - 5, y2 - 6, w, h); // Sets the coordinates for second star.
                        gc.fillOval(x3 - 5, y3 - 5, w, h); // Sets the coordinates for the third star.

                        gc.setStroke(Color.WHITE); // Set the color for the constellation line.
                        gc.strokeLine(x, y, x2, y2); // Sets the coordinates for constellation line from first star to second star.
                        gc.strokeLine(x2, y2, x3, y3); // Sets the coordinates for the constellation line from second to third star.
                        gc.strokeLine(x3, y3, x, y); // Sets the coordinates for the constellation line from third star to first star.

                        // *** Gets the constellation name from user.
                        System.out.print("Enter a name for your constellation: ");
                        String constellation = input.next();

                        gc.setFill(Color.GOLD); // Sets colour of constellation.
                        gc.setFont(new Font("System", 35)); // Sets font style and font size for constellation.
                        gc.fillText(constellation, 10, 790); // Sets the coordinates for constellation name.

                        // *** Prints programming credits.
                        gc.setFont(new Font("System", 20)); // Sets font style and font size for constellation.
                        gc.fillText("App created by: Emmanuel Wanzusi", 1280, 20); // Sets the coordinates for constellation name.

                        stage.show();

                        return;

                    }

                    gc.strokeLine(x2, y2, x3, y3); // Sets the coordinates for the constellation line from second to third star.
                    count++; // Increments count by 1.

                }

                // *** Gets the coordinates for the fourth star.
                System.out.print("Enter the x coordinate for star " + count + ": ");
                x4 = input.nextInt(); // Sets x coordinate for the fourth star.

                if (x4 > 1590) {
                    do { // Asks user to input another value if the value given exceeds canvas width.
                        System.out.println("The x coordinate " + x4 + " provided exceeds the 1590 x value limit.");
                        System.out.print("Please re-enter a max value below 1590 for the x coordinate for star " + count + ": ");
                        x4 = input.nextInt();
                    } while (x4 > 1590);
                }


                System.out.print("Enter the y coordinate for star " + count + ": ");
                y4 = input.nextInt(); // Sets the y coordinate for the fourth star.

                if (y4 > 790) {
                    do { // Asks user to input another value if the value given exceeds canvas height.
                        System.out.println("The y coordinate " + y4 + " provided exceeds the 790 y value limit.");
                        System.out.print("Please re-enter a max value of 790 or below for the y coordinate for star " + count + ": ");
                        y4 = input.nextInt();
                    } while (y4 > 790);
                }

                gc.setStroke(Color.WHITE); // Set the color for the constellation line.
                gc.fillOval(x3 - 5, y3 - 5, w, h); // Sets the coordinates for the third and/or nth star
                gc.fillOval(x4 - 5, y4 - 5, w, h); // Sets the coordinates for the fourth and/or nth star
                gc.strokeLine(x3, y3, x4, y4); // Sets the coordinates for each constellation line.

                count++; // Increments count by 1.

            } while (count - 1 != stars);

            if (count - 1 == stars) { // Connects last start to first star in constellation.

                gc.strokeLine(x4, y4, x, y);

            }

            // *** Gets the constellation name from user.
            System.out.print("Enter a name for your constellation: ");
            String constellation = input.next();


            // *** Prints constellation name.
            gc.setFill(Color.GOLD); // Sets colour of constellation.
            gc.setFont(new Font("System", 35)); // Sets font style and font size for constellation.
            gc.fillText(constellation, 10, 790); // Sets the coordinates for constellation name.


            // *** Prints programming credits.
            gc.setFont(new Font("System", 20)); // Sets font style and font size for authorship.
            gc.fillText("App created by: Emmanuel Wanzusi", 1280, 20); // Sets the coordinates for authorship.


            // YOUR CODE STOPS HERE

            stage.show();
        }

        /**
         * The actual main method that launches the app.
         *
         * @param args unused
         */

    }
}
