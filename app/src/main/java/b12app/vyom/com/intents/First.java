package b12app.vyom.com.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button btn1 = findViewById(R.id.btnFirst);
        Button btn2 = findViewById(R.id.btnSecond);
        Button btn3 = findViewById(R.id.btnThird);
    }

    public void send(View view) {

        Intent intent = new Intent(this,Second.class);

        switch (view.getId()){
            case R.id.btnFirst:
                String f = "An activity represents a single screen in your app with which your user can perform a single, focussed task such as dial the phone, take a photo, send an email, or view a map. Activities are usually presented to the user as full-screen windows.\n" +
                        "An app usually consists of multiple activities that are loosely bound to each other. Typically, one activity in an application is specified as the \"main\" activity, which is presented to the user when the app is launched. Each activity can then start other activities in order to perform different actions.\n" +
                        "Each time a new activity starts, the previous activity is stopped, but the system preserves the activity in a stack (the \"back stack\"). When a new activity starts, that new activity is pushed onto the back stack and takes user focus. The back stack abides to the basic \"last in, first out\" stack mechanism, so, when the user is done with the current activity and presses the Back button, that current activity is popped from the stack (and destroyed) and the previous activity resumes.";


                intent.putExtra("MSG",f);
                startActivity(intent);

                break;
            case R.id.btnSecond:
                String s = "Android activities are started or activated with an intent. Intents are asynchronous messages that you can can use in your activity to request an action from another activity (or other app component). You use intents to start one activity from another and to pass data between activities.\n" +
                        "There are two kinds of intents: explicit and implicit. An explicit intent is one in which you know the target of that intent, that is, you already know the fully-qualified class name of that specific activity. An implicit intent is one in which you do not have the name of the target component, but have a general action to perform. In this practical you'll learn about explicit intents. You'll find out about implicit intents in a later practical.";

                intent.putExtra("MSG",s);
                startActivity(intent);

                break;
            case R.id.btnThird:
                String t = "Each new activity you added to your project has its own layout and Java files, separate from those of the main activity. They also have their own <activity> elements in the Android manifest. As with the main activity, new activities you create in Android Studio also extend from the AppCompatActivity class.\n" +
                        "All the activities in your app are only loosely connected with each other. However, you can define an activity as a parent of another activity in the AndroidManifest.xml file. This parent-child relationship enables Android to add navigation hints such as left-facing arrows in the title bar for each activity.\n" +
                        "Activities communicate with each other (both in the same app and across different apps) with intents. There are two types of intents, explicit and implicit. An explicit intent is one in which the target of that intent is known, that is, you already know the fully-qualified class name of that specific activity. An implicit intent is one in which you do not have the name of the target component, but have a general action to perform. You'll learn about implicit intents in a later practical.";

                intent.putExtra("MSG",t);
                startActivity(intent);
                break;


        }
    }
}
