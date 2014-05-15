package example.client;

import com.google.gwt.core.client.GWT;

public class Example {

	private static Example instance;

	private ExampleViewFactory viewFactory;

	private ExampleClientBundleFactory bundleFactory;

	private Example() {
		viewFactory = new ExampleViewFactory();
	}

	public static Example getInstance() {
		if (instance == null) {
			instance = new Example();
		}
		return instance;
	}

	public ExampleClientBundleFactory getBundleFactory() {
		if (bundleFactory == null) {
			bundleFactory = GWT.create(ExampleClientBundleFactory.class);
		}
		return bundleFactory;
	}

	public ExampleViewFactory getViewFactory() {
		return viewFactory;
	}

	public void setViewFactory(ExampleViewFactory viewFactory) {
		this.viewFactory = viewFactory;
	}
	

}