package com.example.android.habittracker.Data;

import android.provider.BaseColumns;

/**
 * Created by Nanda on 20/11/16.
 */

public class HabitContract {

    private HabitContract() {
    }


    public static final class HabitEntry implements BaseColumns {


        public final static String TABLE_NAME = "habits";


        public final static String _ID = BaseColumns._ID;


        public final static String COLUMN_HABIT_DESC = "Habit";


        public final static String COLUMN_WEEKEND = "weekend";


        public final static String COLUMN_MINS_DAY = "mins";


        public static final int WEEKEND_NO = 0;
        public static final int WEEKEND_YES = 1;

    }
}
