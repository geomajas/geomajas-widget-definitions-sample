package example.client.nostyle;

import example.client.widget.example.ExampleWidgetCssResource;

/**
 * Overrides {@link ExampleWidgetCssResource} with empty style.
 * 
 * @author Jan De Moerloose
 * 
 */
public interface ExampleWidgetCssResourceNoStyle extends ExampleWidgetCssResource {

	@ClassName("gm-exampleWidgetButton")
	String exampleWidgetButton();

}