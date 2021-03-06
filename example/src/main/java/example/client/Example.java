package example.client;

import com.google.gwt.core.client.GWT;

public class Example {

	private static Example instance;

	private ExampleViewFactory viewFactory;

	private ExampleClientBundleFactory bundleFactory;

	private Example() {
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
		if (viewFactory == null) {
			viewFactory = GWT.create(ExampleViewFactory.class);
		}
		return viewFactory;
	}

	/**
	 * Setter to customize viewFactory.
	 * @param viewFactory
	 */
	public void setViewFactory(ExampleViewFactory viewFactory) {
		this.viewFactory = viewFactory;
	}

	/**
	 * Setter to customize the bundleFactory.
	 * @param bundleFactory
	 */
	public void setBundleFactory(ExampleClientBundleFactory bundleFactory) {
		this.bundleFactory = bundleFactory;
	}
}
