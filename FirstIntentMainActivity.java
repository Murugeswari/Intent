package com.example.intent;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class FirstIntentMainActivity extends Activity {

	EditText edit;
		Button gobutton;
			
			    @Override
			        protected void onCreate(Bundle savedInstanceState) {
				        super.onCreate(savedInstanceState);
					        setContentView(R.layout.activity_first_intent_main);
						        edit=(EditText) findViewById(R.id.editText1);
							        gobutton=(Button) findViewById(R.id.Go);
								    } 


								        @Override
									    public boolean onCreateOptionsMenu(Menu menu) {
									            // Inflate the menu; this adds items to the action bar if it is present.
										            getMenuInflater().inflate(R.menu.first_intent_main, menu);
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
																							    
																							        public void myclick(View v) {
																								    	
																									    	if (v==gobutton) {
																										    		Intent firstintent=new Intent();
																												    		String content=edit.getText().toString();
																														    		firstintent.putExtra("received", content);
																																    		firstintent.setClass(FirstIntentMainActivity.this,SecondMainActivity.class );
																																		    		startActivity(firstintent);
																																							}
																																									
																																										}
																																										}

