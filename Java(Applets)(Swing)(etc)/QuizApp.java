import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class QuizApp extends JFrame implements ActionListener {

    private JLabel questionLabel;
    private List<JRadioButton> options = new ArrayList<>();
    private JButton nextButton, submitButton;
    private int currentQuestion = 0, score = 0;
    private List<Question> questions = new ArrayList<>();

    // Constructor to initialize components and questions
    public QuizApp() {
        super("Quiz App");
        setLayout(new GridLayout(0, 1));

        // Add question label
        questionLabel = new JLabel("Question will appear here");
        add(questionLabel);

        // Add radio buttons for options
        ButtonGroup optionGroup = new ButtonGroup();
        for (int i = 0; i < 4; i++) {
            JRadioButton option = new JRadioButton("Option " + (i + 1));
            optionGroup.add(option);
            options.add(option);
            add(option);
        }

        // Add next and submit buttons
        nextButton = new JButton("Next");
        nextButton.addActionListener(this);
        add(nextButton);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        submitButton.setEnabled(false);
        add(submitButton);

        // Add sample questions (replace with your own)
        questions.add(new Question("What is the capital of France?", "Paris", "London", "Berlin", "Rome"));
        questions.add(new Question("What is the largest planet in our solar system?", "Jupiter", "Mars", "Earth", "Venus"));
        questions.add(new Question("What is the chemical symbol for water?", "H2O", "CO2", "O2", "N2"));

        displayQuestion();
    }

    // Display the current question and options
    private void displayQuestion() {
        questionLabel.setText(questions.get(currentQuestion).getQuestionText());
        for (int i = 0; i < 4; i++) {
            options.get(i).setText(questions.get(currentQuestion).getOptions().get(i));
        }
    }

    // Handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == nextButton) {
            checkAnswer();
            currentQuestion++;
            if (currentQuestion == questions.size()) {
                nextButton.setEnabled(false);
                submitButton.setEnabled(true);
            } else {
                displayQuestion();
            }
        } else if (e.getSource() == submitButton) {
            checkAnswer();
            JOptionPane.showMessageDialog(this, "Your score is: " + score + " out of " + questions.size());
        }
    }

    // Check the selected answer and update score
    private void checkAnswer() {
        for (JRadioButton option : options) {
            if (option.isSelected() && option.getText().equals(questions.get(currentQuestion).getCorrectAnswer())) {
                score++;
                break;
            }
        }
    }

    // Main method to start the application
    public static void main(String[] args) {
        new QuizApp().setVisible(true);
    }

    // Class to represent a question
    class Question {
        private String questionText;
        private String correctAnswer;
        private List<String> options = new ArrayList<>();

        public Question(String questionText, String correctAnswer, String... options) {
            this.questionText = questionText;
            this.correctAnswer = correctAnswer;
            for (String option : options) {
                this.options.add(option);
            }
        }

        // Getters for question text, correct answer, and options
    }
}
