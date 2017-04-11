package br.grupointegrado.jucemard.todoproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.grupointegrado.jucemard.todoproject.bd.DataBase;
import br.grupointegrado.jucemard.todoproject.model.ToDo;

public class MainActivity extends AppCompatActivity {

    private ListView lvToDo;
    private DataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = (ListView) findViewById(R.id.lvTodo);

        db = new DataBase(this);

    }

    @Override
    protected void onResume() {
        super.onResume();

        List<ToDo> toDos = db.getTodos();

        ArrayAdapter<ToDo> la =
                new ArrayAdapter<ToDo>(this, android.R.layout.simple_list_item_1, toDos);

        lvToDo.setAdapter(la);
    }

    public void gotoAddToDo(View v) {

//        Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show();

        Intent i = new Intent(this, RegisterToDoActivity.class);
        startActivity(i);

    }

}
