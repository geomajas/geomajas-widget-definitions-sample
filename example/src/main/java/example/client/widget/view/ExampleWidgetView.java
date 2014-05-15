package example.client.widget.view;

import com.google.gwt.user.client.ui.IsWidget;

import example.client.widget.presenter.ExampleWidgetPresenter;

/**
 * MVP view.
 * 
 * @author Jan De Moerloose
 * 
 */
public interface ExampleWidgetView extends IsWidget {

	/**
	 * Sets the presenter for callback.
	 * 
	 * @param presenter
	 */
	void setPresenter(ExampleWidgetPresenter presenter);

	void sayHello();
}
