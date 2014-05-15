package example.client.widget.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

import example.client.Example;
import example.client.widget.presenter.ExampleWidgetPresenter;
import example.client.widget.resource.ExampleWidgetResource;

/**
 * Implementation of {@link ExampleWidgetView}.
 * 
 * @author Jan De Moerloose
 * 
 */
public class ExampleWidgetViewImpl implements ExampleWidgetView {

	@UiField
	protected Button button;

	private ExampleWidgetPresenter presenter;

	private SimpleLayoutPanel widget;

	private static final MyUiBinder UIBINDER = GWT.create(MyUiBinder.class);

	/**
	 * UI binder interface.
	 * 
	 * @author Jan De Moerloose
	 * 
	 */
	interface MyUiBinder extends UiBinder<Widget, ExampleWidgetViewImpl> {
	}

	public ExampleWidgetViewImpl() {
		this(Example.getInstance().getBundleFactory().createExampleWidgetResource());
	}

	public ExampleWidgetViewImpl(ExampleWidgetResource resource) {
		resource.css().ensureInjected();
		widget = (SimpleLayoutPanel) UIBINDER.createAndBindUi(this);
		button.setText("Hello");
	}

	public void setPresenter(ExampleWidgetPresenter presenter) {
		this.presenter = presenter;
	}

	@UiHandler("button")
	public void onButtonClicked(ClickEvent event) {
		presenter.onButton();
	}

	public void sayHello() {
		Window.alert("Hello !");
	}

	public Widget asWidget() {
		return widget;
	}

}
