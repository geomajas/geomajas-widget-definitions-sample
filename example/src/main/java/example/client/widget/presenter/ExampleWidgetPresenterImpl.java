package example.client.widget.presenter;

import example.client.widget.view.ExampleWidgetView;

/**
 * Implementation of {@link ExampleWidgetPresenter}.
 * 
 * @author Jan De Moerloose
 * 
 */
public class ExampleWidgetPresenterImpl implements ExampleWidgetPresenter {

	private ExampleWidgetView view;

	public ExampleWidgetPresenterImpl(ExampleWidgetView view) {
		this.view = view;
		this.view.setPresenter(this);
	}

	public void onButton() {
		view.sayHello();
	}

}
