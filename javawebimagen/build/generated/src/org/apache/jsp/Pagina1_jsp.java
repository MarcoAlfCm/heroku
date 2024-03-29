package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import VO.ImagenVO;
import DAO.ImagenDAO;
import java.util.ArrayList;

public final class Pagina1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"screen\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Documentos Administrativos</h1>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    ");

        ImagenDAO emp = new ImagenDAO();
        ImagenVO pdfvo = new ImagenVO();
        ArrayList<ImagenVO> listar = emp.Listar_ImagenVO();
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"datagrid\">\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Codigo</th>\n");
      out.write("                    <th>Nombres</th>\n");
      out.write("                    <th>Pdf</th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tfoot>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"4\">\n");
      out.write("                        <div id=\"paging\"><ul><li><a href=\"#\"><span>Previous</span></a></li><li><a href=\"#\" class=\"active\"><span>1</span></a></li><li><a href=\"#\"><span>2</span></a></li><li><a href=\"#\"><span>3</span></a></li><li><a href=\"#\"><span>4</span></a></li><li><a href=\"#\"><span>5</span></a></li><li><a href=\"#\"><span>Next</span></a></li></ul>\n");
      out.write("                        </div>\n");
      out.write("                </tr>\n");
      out.write("            </tfoot>\n");
      out.write("            <tbody>\n");
      out.write("                ");
if (listar.size() > 0) {
                        for (ImagenVO listar2 : listar) {
                            pdfvo = listar2;
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(pdfvo.getCodigoimg());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(pdfvo.getNombreimg());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        ");

                            if (pdfvo.getArchivoimg2() != null) {
                        
      out.write("\n");
      out.write("                        <img src=\"Imagen/imagen.png\" title=\"imagen\"/> \n");
      out.write("                        ");

                            } else {
                                out.print("Vacio");
                            }
                        
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <a id=\"mostrar\" href=\"ControllerImagen?action=insert&id=");
      out.print(pdfvo.getCodigoimg());
      out.write("\"> <img src=\"Imagen/add.png\" title=\"Nuevo registro\"/> </a>\n");
      out.write("                        <a href=\"ControllerImagen?action=edit&id=");
      out.print(pdfvo.getCodigoimg());
      out.write("\"> <img src=\"Imagen/page_edit.png\" title=\"Modificar\"/> </a>\n");
      out.write("                        <!-- <a href=\"ControllerPdf?action=delete&id=");
      out.print(pdfvo.getCodigoimg());
      out.write("\"> <img src=\"Imagen/delete.png\" title=\"Eliminar\"/> </a> -->\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
                        }
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
