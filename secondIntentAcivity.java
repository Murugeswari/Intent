package com.example.intent;


import org.w3c.dom.Text;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondMainActivity extends Activity {
	TextView text;
		Button nextbutton;
			

				@Override
					protected void onCreate(Bundle savedInstanceState) {
							super.onCreate(savedInstanceState);
									setContentView(R.layout.activity_second_main);
											text=(TextView) findViewById(R.id.textView1);
													nextbutton=(Button) findViewById(R.id.next);
															Intent secActint=getIntent();
																	String rec_msg=secActint.getExtras().getString("received");
																			text.setText(rec_msg);
																				}

																					@Override
																						public boolean onCreateOptionsMenu(Menu menu) {
																								// Inflate the menu; this adds items to the action bar if it is present.
																										getMenuInflater().inflate(R.menu.second_main, menu);
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
																																																		
																																																			public void onclick(View v) {
																																																					if (v==nextbutton) {
																																																								Intent secondintent=new Intent();
																																																											startActivity(secondintent);
																																																													}
																																																															
																																																																}
																																																																}

