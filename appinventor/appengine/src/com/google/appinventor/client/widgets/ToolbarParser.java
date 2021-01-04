package com.google.appinventor.client.widgets;

import com.google.gwt.core.ext.UnableToCompleteException;
import com.google.gwt.core.ext.typeinfo.JClassType;
import com.google.gwt.uibinder.elementparsers.ElementParser;
import com.google.gwt.uibinder.rebind.FieldWriter;
import com.google.gwt.uibinder.rebind.UiBinderWriter;
import com.google.gwt.uibinder.rebind.XMLElement;

public class ToolbarParser implements ElementParser {
  @Override
  public void parse(XMLElement elem, final String fieldName, JClassType type,
      final UiBinderWriter writer) throws UnableToCompleteException {
    elem.consumeChildElements(new XMLElement.Interpreter<Boolean>() {
      @Override
      public Boolean interpretElement(XMLElement child) throws UnableToCompleteException {
        FieldWriter childField = writer.parseElementToField(child);
        writer.addStatement("%1$s.add(%2$s);", fieldName, childField.getNextReference());
        return true;
      }
    });
  }
}
