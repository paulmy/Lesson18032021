package ru.samsung.lesson12032021;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.TreeSet;


public class BinaryTreeActivity extends Activity {
    EditText edit_node;
    TextView text_node;
    BinaryTree  tree;
    TreeSet<Integer> userTreeSet = new TreeSet<Integer>();
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binarytree);
        edit_node = findViewById(R.id.edit_node);
        text_node = findViewById(R.id.text_node);
        int []b= {10,25,20,6,4,8,50,30,6};
        tree = new BinaryTree(b[0]);
        for (int i = 1; i <b.length ; i++) {
            tree.insertNode(tree,b[i]);
        }
        text_node.setText(tree.printBinaryTree(tree,0));
        userTreeSet.add(123);
       // Log.v("MYLOG",""+tree.printBinaryTree(tree,0,""));
    }

    public void InputNode(View view) {
        /*int a=Integer.parseInt(edit_node.getText().toString());

        tree.insertNode(tree,a);
        text_node.setText(tree.printBinaryTree(tree,0));*/
        userTreeSet.add(Integer.parseInt(edit_node.getText().toString()));
        text_node.setText(userTreeSet.toString());

        edit_node.setText("");


    }
}
