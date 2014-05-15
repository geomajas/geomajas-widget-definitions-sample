package example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

import example.client.widget.example.ExampleWidget;

public class ExampleEntryPoint implements EntryPoint {

	public void onModuleLoad() {
		RootLayoutPanel.get().add(new ExampleWidget());	
	}

}
