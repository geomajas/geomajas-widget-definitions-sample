/*
 * This is part of Geomajas, a GIS framework, http://www.geomajas.org/.
 *
 * Copyright 2008-2014 Geosparc nv, http://www.geosparc.com/, Belgium.
 *
 * The program is available in open source according to the GNU Affero
 * General Public License. All contributions in this program are covered
 * by the Geomajas Contributors License Agreement. For full licensing
 * details, see LICENSE.txt in the project root.
 */

package example.client.widget.example;

import com.google.gwt.resources.client.CssResource;

public interface ExampleWidgetCssResource extends CssResource {

	@ClassName("gm-exampleWidgetButton")
	String exampleWidgetButton();

	@ClassName("gm-exampleWidgetButtonWithImage")
	String exampleWidgetButtonWithImage();
}