package ro.pub.cs.systems.pdsd.practicaltest01;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class PracticalTest01MainActivity extends Activity {

	public String name = "nume";
	public String email = "email";;
	public String phone = "phone";;
	
	EditText mEdit;
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_main);
        
        
        if (savedInstanceState != null) {
            String leftCount = savedInstanceState.getString("leftCount");
            if (leftCount != null) {
              mEdit.setText(leftCount);
            } else {
              mEdit.setText(String.valueOf(0));
            
          }
        }
                        
        
        
        Button mButton_name = (Button)findViewById(R.id.button_name);
        Button mButton_email = (Button)findViewById(R.id.button_email);
        Button mButton_phone = (Button)findViewById(R.id.button_phone);
        
        
        mEdit   = (EditText)findViewById(R.id.editText1);
        
        
        
        mButton_name.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        
                    	 name = mEdit.getText().toString();
                    	                    
                    	
                    	
                        //if(name == "nume")
                        	//mEdit.setText(name);
                        //else name = mEdit.getText().toString();
                       
                        
                    	        
                        
                    }
                });
        
        mButton_email.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        email = mEdit.getText().toString();
                    	mEdit.setText(email);
                    	
                    }
                });
        
        mButton_phone.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                    	phone =  mEdit.getText().toString();
                    	mEdit.setText(phone);
                    }
                });
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) 
    {
    	
    	EditText leftEditText = (EditText)findViewById(R.id.editText1);
        
        savedInstanceState.putString("leftCount", leftEditText.getText().toString());
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.practical_test01_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
