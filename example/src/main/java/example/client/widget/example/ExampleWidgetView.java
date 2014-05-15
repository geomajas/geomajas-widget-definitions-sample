package example.client.widget.example;

import com.google.gwt.user.client.ui.IsWidget;

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
