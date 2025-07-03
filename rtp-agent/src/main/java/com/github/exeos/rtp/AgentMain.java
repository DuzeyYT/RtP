package com.github.exeos.rtp;

import com.github.exeos.rtp.swing.BaseWindow;
import java.lang.instrument.Instrumentation;

public class AgentMain {

  public static void premain(String agentArgs, Instrumentation inst) {
    agentmain(agentArgs, inst);
  }

  public static void agentmain(String args, Instrumentation instrumentation) {
    BaseWindow dialog = new BaseWindow();
    dialog.pack();
    dialog.setVisible(true);
  }
}