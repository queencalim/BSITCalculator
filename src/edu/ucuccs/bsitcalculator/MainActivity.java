package edu.ucuccs.bsitcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends Activity {

	Button zero, one, two, three, four, five, six, seven, eight, nine, plus,
			minus, times, divide, equals, a, b, c, d, e, f, clear;

	EditText disp, disp2, disp3, disp4;
	Spinner spinner;

	Integer num, num1, total;
	String sign;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		zero = (Button) findViewById(R.id.button10);
		one = (Button) findViewById(R.id.button1);
		two = (Button) findViewById(R.id.button2);
		three = (Button) findViewById(R.id.button3);
		four = (Button) findViewById(R.id.button4);
		five = (Button) findViewById(R.id.button5);
		six = (Button) findViewById(R.id.button6);
		seven = (Button) findViewById(R.id.button7);
		eight = (Button) findViewById(R.id.button8);
		nine = (Button) findViewById(R.id.button9);
		plus = (Button) findViewById(R.id.button11);
		minus = (Button) findViewById(R.id.button12);
		times = (Button) findViewById(R.id.button13);
		divide = (Button) findViewById(R.id.button14);
		equals = (Button) findViewById(R.id.button15);
		a = (Button) findViewById(R.id.button16);
		b = (Button) findViewById(R.id.button17);
		c = (Button) findViewById(R.id.button18);
		d = (Button) findViewById(R.id.button19);
		e = (Button) findViewById(R.id.button20);
		f = (Button) findViewById(R.id.button21);
		clear = (Button) findViewById(R.id.button22);
		disp = (EditText) findViewById(R.id.editText1);
		disp2 = (EditText) findViewById(R.id.editText2);
		disp3 = (EditText) findViewById(R.id.editText3);
		disp4 = (EditText) findViewById(R.id.editText4);

		spinner = (Spinner) findViewById(R.id.spinner1);

		// Create an ArrayAdapter using the string array and a default spinner
		// layout
		ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
				this, R.array.ewan, android.R.layout.simple_spinner_item);
		// Specify the layout to use when the list of choices appears
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		// Apply the adapter to the spinner
		spinner.setAdapter(adapter);

		spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				if (arg2 == 0) {
					zero.setEnabled(true);
					one.setEnabled(true);
					two.setEnabled(false);
					three.setEnabled(false);
					four.setEnabled(false);
					five.setEnabled(false);
					six.setEnabled(false);
					seven.setEnabled(false);
					eight.setEnabled(false);
					nine.setEnabled(false);
					a.setEnabled(false);
					b.setEnabled(false);
					c.setEnabled(false);
					d.setEnabled(false);
					e.setEnabled(false);
					f.setEnabled(false);

				} else if (arg2 == 1) {
					zero.setEnabled(true);
					one.setEnabled(true);
					two.setEnabled(true);
					three.setEnabled(true);
					four.setEnabled(true);
					five.setEnabled(true);
					six.setEnabled(true);
					seven.setEnabled(true);
					eight.setEnabled(false);
					nine.setEnabled(false);
					a.setEnabled(false);
					b.setEnabled(false);
					c.setEnabled(false);
					d.setEnabled(false);
					e.setEnabled(false);
					f.setEnabled(false);

				} else if (arg2 == 2) {
					zero.setEnabled(true);
					one.setEnabled(true);
					two.setEnabled(true);
					three.setEnabled(true);
					four.setEnabled(true);
					five.setEnabled(true);
					six.setEnabled(true);
					seven.setEnabled(true);
					eight.setEnabled(true);
					nine.setEnabled(true);
					a.setEnabled(false);
					b.setEnabled(false);
					c.setEnabled(false);
					d.setEnabled(false);
					e.setEnabled(false);
					f.setEnabled(false);
				} else {
					zero.setEnabled(true);
					one.setEnabled(true);
					two.setEnabled(true);
					three.setEnabled(true);
					four.setEnabled(true);
					five.setEnabled(true);
					six.setEnabled(true);
					seven.setEnabled(true);
					eight.setEnabled(true);
					nine.setEnabled(true);
					a.setEnabled(true);
					b.setEnabled(true);
					c.setEnabled(true);
					d.setEnabled(true);
					e.setEnabled(true);
					f.setEnabled(true);
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

	public void zero(View v) {
		disp.setText(disp.getText() + "0");
	}

	public void one(View v) {
		disp.setText(disp.getText() + "1");
	}

	public void two(View v) {
		disp.setText(disp.getText() + "2");
	}

	public void three(View v) {
		disp.setText(disp.getText() + "3");
	}

	public void four(View v) {
		disp.setText(disp.getText() + "4");
	}

	public void five(View v) {
		disp.setText(disp.getText() + "5");
	}

	public void six(View v) {
		disp.setText(disp.getText() + "6");
	}

	public void seven(View v) {
		disp.setText(disp.getText() + "7");
	}

	public void eight(View v) {
		disp.setText(disp.getText() + "8");
	}

	public void nine(View v) {
		disp.setText(disp.getText() + "9");
	}

	public void a(View v) {
		disp.setText(disp.getText() + "A");
	}

	public void b(View v) {
		disp.setText(disp.getText() + "B");
	}

	public void c(View v) {
		disp.setText(disp.getText() + "C");
	}

	public void d(View v) {
		disp.setText(disp.getText() + "D");
	}

	public void e(View v) {
		disp.setText(disp.getText() + "E");
	}

	public void f(View v) {
		disp.setText(disp.getText() + "F");
	}

	public void plus(View v) {
		disp2.setText(disp.getText().toString());
		disp3.setText("+");
		disp.setText("");
		disp4.setText(disp.getText().toString());
		
	
	}

	public void minus(View v) {
		disp2.setText(disp.getText().toString());
		disp3.setText("-");
		disp.setText("");
		disp4.setText(disp.getText().toString());

	}

	public void times(View v) {
		disp2.setText(disp.getText().toString());
		disp3.setText("*");
		disp.setText("");
		disp4.setText(disp.getText().toString());

	}

	public void divide(View v) {
		disp2.setText(disp.getText().toString());
		disp3.setText("/");
		disp.setText("");
		disp4.setText(disp.getText().toString());
	}

	public void clear(View v) {
		disp.setText("");
		disp2.setText("");
		disp3.setText("");
		disp4.setText("");

	}

	public void equals(View v) {
		num = Integer.parseInt(disp.getText().toString());
		num1 = Integer.parseInt(disp2.getText().toString());
		sign= disp3.getText().toString();
		
		
		if(sign.equals("+")){
			total = (num + num1);
		}else if(sign.equals("-")){
			total = (num - num1);
		}else if(sign.equals("*")){
			total = (num * num1);
		}else{
			total = (num / num1);
		}
		
		
		disp.setText("");
		disp.setText(total.toString());
		
		
		
	}

}
