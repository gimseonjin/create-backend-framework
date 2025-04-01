package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws IOException {

    String mode = request.getParameter("mode");
    PrintWriter out = response.getWriter();

    if ("callList".equals(mode)) {
      callList(request, out);
      return;
    }

    if ("callWrite".equals(mode)) {
      callWrite(request, out);
      return;
    }

    if ("exeWrite".equals(mode)) {
      exeWrite(request, out);
      return;
    }

    out.println("mode=" + mode);

  }

  void callList(HttpServletRequest request, PrintWriter out) {
    out.print("this View callList");
  }

  void callWrite(HttpServletRequest request, PrintWriter out) {
    out.print("this View callWrite");
  }

  void exeWrite(HttpServletRequest request, PrintWriter out) {
    out.println("exeWrite ok");
    callList(request, out);
  }

}
