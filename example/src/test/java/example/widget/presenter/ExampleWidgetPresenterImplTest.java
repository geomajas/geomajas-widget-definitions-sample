package example.widget.presenter;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import com.google.gwtmockito.GwtMockitoTestRunner;

import example.client.widget.presenter.ExampleWidgetPresenterImpl;
import example.client.widget.view.ExampleWidgetView;

@RunWith(GwtMockitoTestRunner.class)
public class ExampleWidgetPresenterImplTest {

	@Mock
	private ExampleWidgetView view;

	@Test
	public void onButton() {
		ExampleWidgetPresenterImpl presenter = new ExampleWidgetPresenterImpl(view);
		presenter.onButton();
		verify(view).sayHello();
	}
}
