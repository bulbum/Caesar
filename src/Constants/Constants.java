package Constants;

import java.awt.*;

public interface Constants {
    interface Colors {
        Color MAIN_COLOR = new Color(32, 32, 32);
        Color MAIN_TEXTPANEL_COLOR = new Color(48, 48, 48);
        Color SLOT_UP_COLOR = new Color(16, 112, 214);
        Color SLOT_DOWN_COLOR = new Color(16, 123, 214);
        Color GISTOGRAMM_COLOR = new Color(255, 58, 69);
    }

    interface Fonts {
        Font TABLE_FONT = new Font("Arial", Font.BOLD, 9);
        Font SLOT_FONT = new Font("Arial", Font.BOLD, 12);
        Font TEXTAREA_FONT = new Font("Arial", Font.BOLD, 12);
        Font RULER_FONT = new Font("Consolas", Font.BOLD, 20);
        Font BUTTONS_FONT = new Font("Arial", Font.BOLD, 18);
        Font FIELD_FONT = new Font("Arial", Font.BOLD, 18);
    }

    interface Slots {
        String PERMUTATIONS_SLOT = "Permutations";
        String SUBSTITUTIONS_SLOT = "Substitutions";
        String FRIEDMAN_INDEX_SLOT = "The Friedman Index";
        String FUNCTIONS_SLOT = "Functions";
        String FREQUENCY_SLOT = "Frequency";
    }

    interface Sizes {
        int MAINFRAME_INDENT_X = 25 * Toolkit.getDefaultToolkit().getScreenSize().width / 100;
        int MAINFRAME_INDENT_Y = 5 * Toolkit.getDefaultToolkit().getScreenSize().height / 100;
        int MAINFRAME_SIZE_X = 50 * Toolkit.getDefaultToolkit().getScreenSize().width / 100;
        int MAINFRAME_SIZE_Y = 50 * Toolkit.getDefaultToolkit().getScreenSize().width / 100;

        Rectangle PANEL_MAINTEXT_BOUNDS = new Rectangle(MAINFRAME_SIZE_X / 50, MAINFRAME_SIZE_Y / 50, 94 * MAINFRAME_SIZE_X / 100, MAINFRAME_SIZE_Y / 4);
        Rectangle PANEL_SLOTS_BOUNDS = new Rectangle(MAINFRAME_SIZE_X / 50, 2 * MAINFRAME_SIZE_Y / 50 + MAINFRAME_SIZE_Y / 4, MAINFRAME_SIZE_X / 6, MAINFRAME_SIZE_Y - 5 * PANEL_MAINTEXT_BOUNDS.y - PANEL_MAINTEXT_BOUNDS.height);
        Rectangle PANEL_OPERATIONAL_BOUNDS = new Rectangle(2 * PANEL_SLOTS_BOUNDS.x + PANEL_SLOTS_BOUNDS.width, PANEL_SLOTS_BOUNDS.y, PANEL_MAINTEXT_BOUNDS.width - PANEL_SLOTS_BOUNDS.width - PANEL_SLOTS_BOUNDS.x, PANEL_SLOTS_BOUNDS.height);

        Rectangle BUTTON_STATISTICS_BOUNDS = new Rectangle(MAINFRAME_SIZE_X / 2 - PANEL_SLOTS_BOUNDS.width - 80, 10, 200, 60);
        Rectangle GISTOGRAMM_BOUNDS = new Rectangle(PANEL_SLOTS_BOUNDS.x / 2, 4 * BUTTON_STATISTICS_BOUNDS.y + BUTTON_STATISTICS_BOUNDS.height, PANEL_OPERATIONAL_BOUNDS.width - PANEL_SLOTS_BOUNDS.x, PANEL_SLOTS_BOUNDS.height - 10 * BUTTON_STATISTICS_BOUNDS.y);

        Rectangle BUTTON_CLEAN_BOUNDS = new Rectangle(PANEL_OPERATIONAL_BOUNDS.width / 2 - 250, 30, 500, 50);
        Rectangle BUTTON_UPCASE_BOUNDS = new Rectangle(PANEL_OPERATIONAL_BOUNDS.width / 2 - 250, BUTTON_CLEAN_BOUNDS.y + BUTTON_CLEAN_BOUNDS.height + 30, 500, 50);
        Rectangle BUTTON_DOWNCASE_BOUNDS = new Rectangle(PANEL_OPERATIONAL_BOUNDS.width / 2 - 250, BUTTON_UPCASE_BOUNDS.y + BUTTON_UPCASE_BOUNDS.height + 30, 500, 50);
        Rectangle BUTTON_DIVIDECOLUMN_BOUNDS = new Rectangle(PANEL_OPERATIONAL_BOUNDS.width / 2 - 250, BUTTON_DOWNCASE_BOUNDS.y + BUTTON_DOWNCASE_BOUNDS.height + 30, 440, 50);
        Rectangle TEXTFIELD_DIVIDECOLUMN_BOUNDS = new Rectangle(BUTTON_DIVIDECOLUMN_BOUNDS.x + BUTTON_DIVIDECOLUMN_BOUNDS.width + 10, BUTTON_DOWNCASE_BOUNDS.y + BUTTON_DOWNCASE_BOUNDS.height + 30, 50, 50);

        Rectangle BUTTON_COINCIDENCE_BOUNDS = new Rectangle(BUTTON_UPCASE_BOUNDS.x, 0, BUTTON_UPCASE_BOUNDS.width, 50);
        Rectangle VALUE_COINCIDENCE_BOUNDS = new Rectangle(0, BUTTON_COINCIDENCE_BOUNDS.y + BUTTON_COINCIDENCE_BOUNDS.height + 15, 600, 20);
        Rectangle BUTTON_MUTUAL_COINCIDENCE_BOUNDS = new Rectangle(BUTTON_UPCASE_BOUNDS.x, VALUE_COINCIDENCE_BOUNDS.y + VALUE_COINCIDENCE_BOUNDS.height + 15, BUTTON_COINCIDENCE_BOUNDS.width, BUTTON_COINCIDENCE_BOUNDS.height);
        Rectangle VALUE_MUTUAL_COINCIDENCE_BOUNDS = new Rectangle(VALUE_COINCIDENCE_BOUNDS.x, BUTTON_MUTUAL_COINCIDENCE_BOUNDS.y + BUTTON_MUTUAL_COINCIDENCE_BOUNDS.height + 15, VALUE_COINCIDENCE_BOUNDS.width, VALUE_COINCIDENCE_BOUNDS.height);
        Rectangle TEXTPANEL_MUTUALFRIEDMAN_BOUNDS = new Rectangle(0, VALUE_MUTUAL_COINCIDENCE_BOUNDS.y + VALUE_MUTUAL_COINCIDENCE_BOUNDS.height + 15, PANEL_OPERATIONAL_BOUNDS.width, 100);
        Rectangle TABLE_FRIEDMAN_BOUNDS = new Rectangle(TEXTPANEL_MUTUALFRIEDMAN_BOUNDS.x, TEXTPANEL_MUTUALFRIEDMAN_BOUNDS.y + TEXTPANEL_MUTUALFRIEDMAN_BOUNDS.height + 45, TEXTPANEL_MUTUALFRIEDMAN_BOUNDS.width, 30);
        Rectangle TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS = new Rectangle(TABLE_FRIEDMAN_BOUNDS.x, TABLE_FRIEDMAN_BOUNDS.y + TABLE_FRIEDMAN_BOUNDS.height + 40, TABLE_FRIEDMAN_BOUNDS.width, TABLE_FRIEDMAN_BOUNDS.height);
        Rectangle TABLE_ENG_MUTUAL_FRIEDMAN_BOUNDS = new Rectangle(TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.x, TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.y + TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.height + 40, TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.width, TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.height);
        Rectangle LABEL_FRIEDMAN_BOUNDS = new Rectangle(TABLE_FRIEDMAN_BOUNDS.x, TABLE_FRIEDMAN_BOUNDS.y - TABLE_FRIEDMAN_BOUNDS.height, TABLE_FRIEDMAN_BOUNDS.width, TABLE_FRIEDMAN_BOUNDS.height);
        Rectangle LABEL_RUS_MUTUAL_FRIEDMAN_BOUNDS = new Rectangle(TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.x, TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.y - TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.height, TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.width, TABLE_RUS_MUTUAL_FRIEDMAN_BOUNDS.height);
        Rectangle LABEL_ENG_MUTUAL_FRIEDMAN_BOUNDS = new Rectangle(TABLE_ENG_MUTUAL_FRIEDMAN_BOUNDS.x, TABLE_ENG_MUTUAL_FRIEDMAN_BOUNDS.y - TABLE_ENG_MUTUAL_FRIEDMAN_BOUNDS.height, TABLE_ENG_MUTUAL_FRIEDMAN_BOUNDS.width, TABLE_ENG_MUTUAL_FRIEDMAN_BOUNDS.height);

        Rectangle BUTTON_SUBST_START_BOUNDS = new Rectangle(BUTTON_STATISTICS_BOUNDS.x, BUTTON_STATISTICS_BOUNDS.y, BUTTON_STATISTICS_BOUNDS.width, BUTTON_STATISTICS_BOUNDS.height);
        Rectangle TEXTPANEL_SUBST_BOUNDS = new Rectangle(GISTOGRAMM_BOUNDS.x, BUTTON_SUBST_START_BOUNDS.y + BUTTON_SUBST_START_BOUNDS.height + 30, GISTOGRAMM_BOUNDS.width, GISTOGRAMM_BOUNDS.height / 3);
        Rectangle LABEL_LETTER_SUBST_BOUNDS = new Rectangle(5, 0, 20, 30);

        Rectangle BUTTON_PERMUTATION_START_BOUNDS = BUTTON_SUBST_START_BOUNDS;
        Rectangle TEXTPANEL_PERMUTATION_BOUNDS = new Rectangle(50, BUTTON_PERMUTATION_START_BOUNDS.y + BUTTON_PERMUTATION_START_BOUNDS.height + 50, 385, 370);
        Rectangle LABEL_RULER_BOUNDS = new Rectangle(TEXTPANEL_PERMUTATION_BOUNDS.x, TEXTPANEL_PERMUTATION_BOUNDS.y - 25, TEXTPANEL_PERMUTATION_BOUNDS.width, 30);
        Rectangle TEXTFIELD_PERMUTATION_OLD_NUMBER_BOUNDS = new Rectangle(TEXTPANEL_PERMUTATION_BOUNDS.x + TEXTPANEL_PERMUTATION_BOUNDS.width + 10, TEXTPANEL_PERMUTATION_BOUNDS.y, 50, 20);
        Rectangle TEXTFIELD_PERMUTATION_NEW_NUMBER_BOUNDS = new Rectangle(TEXTFIELD_PERMUTATION_OLD_NUMBER_BOUNDS.x + TEXTFIELD_PERMUTATION_OLD_NUMBER_BOUNDS.width + 10, TEXTPANEL_PERMUTATION_BOUNDS.y, 50, 20);
        Rectangle BUTTON_SWAP_ROWS_BOUNDS = new Rectangle(TEXTFIELD_PERMUTATION_OLD_NUMBER_BOUNDS.x, TEXTFIELD_PERMUTATION_NEW_NUMBER_BOUNDS.y + TEXTFIELD_PERMUTATION_NEW_NUMBER_BOUNDS.height + 10, TEXTFIELD_PERMUTATION_OLD_NUMBER_BOUNDS.width + 10 + TEXTFIELD_PERMUTATION_NEW_NUMBER_BOUNDS.width, 30);
    }

    interface Buttons {
        String BUTTON_MUTUAL_FRIEDMAN = "Index of mutual coincidence";
        String BUTTON_DIVIDE_INTO_COLUMNS = "Divide into columns";
        String BUTTON_FREEDMAN = "Index of coincidence";
        String BUTTON_CLEAN = "Clear text from symbols";
        String BUTTON_UPPER_CASE = "To upper case";
        String BUTTON_LOWER_CASE = "To lower case";
        String BUTTON_STATISTICS = "Statistics";
        String BUTTON_START = "Start";
        String BUTTON_SWAP = "Swap";
    }
}
