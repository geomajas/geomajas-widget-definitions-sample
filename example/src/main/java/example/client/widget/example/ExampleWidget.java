package example.client.widget.example;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

import example.client.Example;

public class ExampleWidget implements IsWidget {

	private ExampleWidgetView view;

	private ExampleWidgetPresenter presenter;

	public ExampleWidget() {
		this(Example.getInstance().getViewFactory().createExampleWidgetView());
	}

	public ExampleWidget(ExampleWidgetView view) {
		this.view = view;
		presenter = new ExampleWidgetPresenterImpl(view);
	}

	public Widget asWidget() {
		return view.asWidget();
	}

}
