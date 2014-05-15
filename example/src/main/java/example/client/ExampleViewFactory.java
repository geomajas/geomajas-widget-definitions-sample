package example.client;

import example.client.widget.example.ExampleWidgetView;
import example.client.widget.example.ExampleWidgetViewImpl;

public class ExampleViewFactory {

	public ExampleWidgetView createExampleWidgetView() {
		return new ExampleWidgetViewImpl();
	}
}
