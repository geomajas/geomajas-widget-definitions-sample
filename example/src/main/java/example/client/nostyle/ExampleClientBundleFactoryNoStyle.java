package example.client.nostyle;

import com.google.gwt.core.client.GWT;

import example.client.ExampleClientBundleFactory;
import example.client.widget.resource.ExampleWidgetResource;

/**
 * Overrides {@link ExampleClientBundleFactory} with empty styles.
 * 
 * @author Jan De Moerloose
 * 
 */
public class ExampleClientBundleFactoryNoStyle extends ExampleClientBundleFactory {

	public ExampleWidgetResource createExampleWidgetResource() {
		return GWT.create(ExampleWidgetResourceNoStyle.class);
	}

}
