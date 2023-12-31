// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2023 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0

package com.google.appinventor.client.editor.youngandroid.actions;

import com.google.appinventor.client.Ode;
import com.google.gwt.user.client.Command;

public class ResetAction implements Command {
  @Override
  public void execute() {
    if (Ode.getInstance().okToConnect()) {
      Ode.getInstance().getTopToolbar().startRepl(false, false, false, false); // We are really stopping the repl here
    }
  }
}
