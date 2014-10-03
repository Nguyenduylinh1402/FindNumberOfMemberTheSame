package com.linhnguyen.findnumberofmemberthesame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText edt1;
	TextView tvx1, tvx2;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edt1 = (EditText) findViewById(R.id.edt1);
		tvx1 = (TextView) findViewById(R.id.tvx1);
		tvx2 = (TextView) findViewById(R.id.tvx2);
		btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				String string = edt1.getText().toString();
				char[] arr = string.toCharArray();
				int bigsum;
				int sum = 1;// example
				int i;
				char temp = arr[0];// example
				int length = string.length();
				if (length > 1) {
					sum = 1;
					int j;
					for (j = 0; j < length - sum; j++) {
						bigsum = 1;
						i = j;
//						for(){
//							
//						}
						
						
//						while (true) {
//							int founds = string.indexOf(arr[j], i + 1);
//							if (founds != -1) {
//								bigsum++;
//								// swap charAt(founds) vs charAt(i+1)
//								j++;
//								if (j != founds) {
//									char a = arr[founds];
//									arr[founds] = arr[j];
//									arr[j] = a;
//								}
//
//							} else
//								break;
//							i = founds;
//							if (i >= length - 1)
//								break;
//
//						}
						if (bigsum > sum) {
							temp = arr[j];
							sum = bigsum;
						}
					}
				}
				tvx1.setText(" " + temp);
				tvx2.setText(" " + sum);
				// int sum0, i;
				// int sum = 0;
				//
				// char temp = (Character) null;// = string1.charAt(0);
				// int length = string1.length();
				// if (length == 1) {
				// sum = 1;
				// temp = string1.charAt(0);
				// } else if (length > 1) {
				// sum = 1;
				// int j;
				// for (j = 0; j < length - sum; j++) {
				// sum0 = 1;
				// i = j;
				// while (true) {
				// int founds = string1.indexOf(string1.charAt(i),
				// i + 1);
				//
				// if (founds != -1) {
				// sum0++;
				// // swap charAt(founds) vs charAt(i+1)
				//
				//
				// } else
				// break;
				// i = founds;
				// if (i >= length - 1)
				// break;
				//
				// }
				// if (sum0 > sum) {
				// temp = string1.charAt(j);
				// sum = sum0;
				// }
				// if (sum > length / 2)
				// break;
				// while (string1.charAt(j + 1) == string1.charAt(j)) {
				// j = j + 1;
				// if (j >= length - 1)
				// break;
				// }
				//
				// }
				// }
				//

			}
		});
	}

}
