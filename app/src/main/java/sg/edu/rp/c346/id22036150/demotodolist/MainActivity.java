package sg.edu.rp.c346.id22036150.demotodolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvList;
    ArrayList<ToDoItem> alList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar date1 = Calendar.getInstance();
        date1.set(2020, Calendar.AUGUST, 1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2020, Calendar.AUGUST, 2);
        lvList = findViewById(R.id.lvToDo);
        alList = new ArrayList<>();

        ToDoItem item1 = new ToDoItem("Go for movie", date1);
        ToDoItem item2 = new ToDoItem("Go for haircut", date2);

        alList.add(item1);
        alList.add(item2);

        adapter = new CustomAdapter(this, R.layout.row , alList);
        lvList.setAdapter(adapter);

    }
}