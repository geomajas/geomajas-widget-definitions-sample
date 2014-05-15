package example.client;

import example.client.widget.view.ExampleWidgetView;
import example.client.widget.view.ExampleWidgetViewImpl;

public class ExampleViewFactory {

	public ExampleWidgetView createExampleWidgetView() {
		return new ExampleWidgetViewImpl();
	}
}
