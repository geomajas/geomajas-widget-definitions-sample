package example.client.nostyle;

import example.client.widget.resource.ExampleWidgetResource;

/**
 * Overrides {@link ExampleWidgetResource} with empty style.
 * 
 * @author Jan De Moerloose
 * 
 */
public interface ExampleWidgetResourceNoStyle extends ExampleWidgetResource {

	@Source("example-widget-nostyle.css")
	ExampleWidgetCssResourceNoStyle css();

}