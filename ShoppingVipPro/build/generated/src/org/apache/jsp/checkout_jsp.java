package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/components/navbarComponent.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"zxx\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>aranaz</title>\n");
      out.write("        <link rel=\"icon\" href=\"img/favicon.png\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <!-- animate CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <!-- owl carousel CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <!-- nice select CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\">\n");
      out.write("        <!-- font awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/all.css\">\n");
      out.write("        <!-- flaticon CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\n");
      out.write("        <!-- font awesome CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("        <!-- swiper CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slick.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/price_rangs.css\">\n");
      out.write("        <!-- style CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--::header part start::-->\n");
      out.write("<header class=\"main_menu home_menu\" style=\"position: fixed;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row align-items-center\">\n");
      out.write("            <div class=\"col-lg-12\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\"> <img src=\"img/logo.png\" alt=\"logo\"> </a>\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"menu_icon\"><i class=\"fas fa-bars\"></i></span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse main-menu-item\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"home\">Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"blog.html\" id=\"navbarDropdown_1\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    Shop\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_1\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"category.html\"> shop category</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"single-product.html\">product details</a>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"blog.html\" id=\"navbarDropdown_3\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    pages\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_2\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"login.html\"> login</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"tracking.html\">tracking</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"checkout.html\">product checkout</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"cart.html\">shopping cart</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"confirmation.html\">confirmation</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"elements.html\">elements</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item dropdown\">\n");
      out.write("                                <a class=\"nav-link dropdown-toggle\" href=\"blog.html\" id=\"navbarDropdown_2\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    blog\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown_2\">\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"blog.html\"> blog</a>\n");
      out.write("                                    <a class=\"dropdown-item\" href=\"single-blog.html\">Single blog</a>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"contact.html\">Contact</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"hearer_icon d-flex\">\n");
      out.write("                        <a id=\"search_1\" href=\"javascript:void(0)\"><i class=\"fas fa-search\"></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fas fa-heart\"></i></a>\n");
      out.write("                        <div class=\"dropdown cart\">\n");
      out.write("                            <a href=\"cart\">\n");
      out.write("                                <i class=\"fas fa-shopping-cart\"></i> \n");
      out.write("                                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <div class=\"dropdown-cart\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_choose_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <div class=\"view-cart-btn\">\n");
      out.write("                                        <a href=\"#\" class=\"genric-btn success large\">View Cart</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("                ");
      if (_jspx_meth_c_choose_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"search_input\" id=\"search_input_box\">\n");
      out.write("        <div class=\"container \">\n");
      out.write("            <form class=\"d-flex justify-content-between search-inner\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"search_input\" placeholder=\"Search Here\">\n");
      out.write("                <button type=\"submit\" class=\"btn\"></button>\n");
      out.write("                <span class=\"ti-close\" id=\"close_search\" title=\"Close Search\"></span>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("<!-- Header part end-->");
      out.write("\n");
      out.write("        <!--================Home Banner Area =================-->\n");
      out.write("        <!-- breadcrumb start-->\n");
      out.write("        <section class=\"breadcrumb breadcrumb_bg\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-center\">\n");
      out.write("                    <div class=\"col-lg-8\">\n");
      out.write("                        <div class=\"breadcrumb_iner\">\n");
      out.write("                            <div class=\"breadcrumb_iner_item\">\n");
      out.write("                                <h2>Producta Checkout</h2>\n");
      out.write("                                <p>Home <span>-</span> Shop Single</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- breadcrumb start-->\n");
      out.write("\n");
      out.write("        <!--================Checkout Area =================-->\n");
      out.write("        <section class=\"checkout_area padding_top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_choose_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<!--================End Checkout Area =================-->\n");
      out.write("\n");
      out.write("<!--::footer_part start::-->\n");
      out.write("<footer class=\"footer_part\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row justify-content-around\">\n");
      out.write("            <div class=\"col-sm-6 col-lg-2\">\n");
      out.write("                <div class=\"single_footer_part\">\n");
      out.write("                    <h4>Top Products</h4>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"\">Managed Website</a></li>\n");
      out.write("                        <li><a href=\"\">Manage Reputation</a></li>\n");
      out.write("                        <li><a href=\"\">Power Tools</a></li>\n");
      out.write("                        <li><a href=\"\">Marketing Service</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-lg-2\">\n");
      out.write("                <div class=\"single_footer_part\">\n");
      out.write("                    <h4>Quick Links</h4>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"\">Jobs</a></li>\n");
      out.write("                        <li><a href=\"\">Brand Assets</a></li>\n");
      out.write("                        <li><a href=\"\">Investor Relations</a></li>\n");
      out.write("                        <li><a href=\"\">Terms of Service</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-lg-2\">\n");
      out.write("                <div class=\"single_footer_part\">\n");
      out.write("                    <h4>Features</h4>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"\">Jobs</a></li>\n");
      out.write("                        <li><a href=\"\">Brand Assets</a></li>\n");
      out.write("                        <li><a href=\"\">Investor Relations</a></li>\n");
      out.write("                        <li><a href=\"\">Terms of Service</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-lg-2\">\n");
      out.write("                <div class=\"single_footer_part\">\n");
      out.write("                    <h4>Resources</h4>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li><a href=\"\">Guides</a></li>\n");
      out.write("                        <li><a href=\"\">Research</a></li>\n");
      out.write("                        <li><a href=\"\">Experts</a></li>\n");
      out.write("                        <li><a href=\"\">Agencies</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6 col-lg-4\">\n");
      out.write("                <div class=\"single_footer_part\">\n");
      out.write("                    <h4>Newsletter</h4>\n");
      out.write("                    <p>Heaven fruitful doesn't over lesser in days. Appear creeping\n");
      out.write("                    </p>\n");
      out.write("                    <div id=\"mc_embed_signup\">\n");
      out.write("                        <form target=\"_blank\"\n");
      out.write("                              action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\"\n");
      out.write("                              method=\"get\" class=\"subscribe_form relative mail_part\">\n");
      out.write("                            <input type=\"email\" name=\"email\" id=\"newsletter-form-email\" placeholder=\"Email Address\"\n");
      out.write("                                   class=\"placeholder hide-on-focus\" onfocus=\"this.placeholder = ''\"\n");
      out.write("                                   onblur=\"this.placeholder = ' Email Address '\">\n");
      out.write("                            <button type=\"submit\" name=\"submit\" id=\"newsletter-submit\"\n");
      out.write("                                    class=\"email_icon newsletter-submit button-contactForm\">subscribe</button>\n");
      out.write("                            <div class=\"mt-10 info\"></div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"copyright_part\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <div class=\"copyright_text\">\n");
      out.write("                        <P><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                            Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class=\"ti-heart\" aria-hidden=\"true\"></i> by <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                            <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></P>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <div class=\"footer_icon social_icon\">\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li><a href=\"#\" class=\"single_social_icon\"><i class=\"fab fa-facebook-f\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"single_social_icon\"><i class=\"fab fa-twitter\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"single_social_icon\"><i class=\"fas fa-globe\"></i></a></li>\n");
      out.write("                            <li><a href=\"#\" class=\"single_social_icon\"><i class=\"fab fa-behance\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<!--::footer_part end::-->\n");
      out.write("\n");
      out.write("<!-- jquery plugins here-->\n");
      out.write("<!-- jquery -->\n");
      out.write("<script src=\"js/jquery-1.12.1.min.js\"></script>\n");
      out.write("<!-- popper js -->\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<!-- bootstrap js -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!-- easing js -->\n");
      out.write("<script src=\"js/jquery.magnific-popup.js\"></script>\n");
      out.write("<!-- swiper js -->\n");
      out.write("<script src=\"js/swiper.min.js\"></script>\n");
      out.write("<!-- swiper js -->\n");
      out.write("<script src=\"js/masonry.pkgd.js\"></script>\n");
      out.write("<!-- particles js -->\n");
      out.write("<script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("<!-- slick js -->\n");
      out.write("<script src=\"js/slick.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.counterup.min.js\"></script>\n");
      out.write("<script src=\"js/waypoints.min.js\"></script>\n");
      out.write("<script src=\"js/contact.js\"></script>\n");
      out.write("<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("<script src=\"js/jquery.form.js\"></script>\n");
      out.write("<script src=\"js/jquery.validate.min.js\"></script>\n");
      out.write("<script src=\"js/mail-script.js\"></script>\n");
      out.write("<script src=\"js/stellar.js\"></script>\n");
      out.write("<script src=\"js/price_rangs.js\"></script>\n");
      out.write("<!-- custom js -->\n");
      out.write("<script src=\"js/custom.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <span class=\"badge badge-danger\" style=\"font-size: 10px;\">0</span>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <span class=\"badge badge-danger\" style=\"font-size: 10px;\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(null);
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.carts.size()==0||sessionScope.carts==null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <h1>List Cart is Empty</h1>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <div class=\"dropdown-cart-prod\">\n");
        out.write("                                                ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            </div>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_1);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${carts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("ct");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                    <div class=\"single_product\">\n");
          out.write("                                                        <div class=\"cart-css-div\" style=\"\n");
          out.write("                                                             border: 1px solid #c5c4c4;\n");
          out.write("                                                             display: flex;\n");
          out.write("                                                             align-items: center;\n");
          out.write("                                                             margin-bottom: 10px;\n");
          out.write("                                                             \">\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" class=\"cart-css\" style=\"\n");
          out.write("                                                                 max-width: 60%;\n");
          out.write("                                                                 margin-right: 10px;\n");
          out.write("                                                                 \">\n");
          out.write("                                                            <span>Name:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("                                                                Price:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("                                                                Quantity:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("<br>\n");
          out.write("                                                                <a href=\"delete-cart?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ct.value.product.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"genric-btn primary small\">Delete </a></span>                                                           \n");
          out.write("                                                        </div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_2.setParent(null);
    int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
    if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"log-sgin\">\n");
        out.write("                            <a href=\"profile?accountId=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" class=\"genric-btn info \">USER</a>\n");
        out.write("                            <a href=\"logout\" class=\"genric-btn success\">Log-out</a>\n");
        out.write("                        </div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
    int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
    if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"log-sgin\">\n");
        out.write("                            <a href=\"login.jsp\" class=\"genric-btn info\">Login</a>\n");
        out.write("                            <a href=\"register.jsp\" class=\"genric-btn success\">Sign-Up</a>\n");
        out.write("                        </div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
    return false;
  }

  private boolean _jspx_meth_c_choose_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_3.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_3.setParent(null);
    int _jspx_eval_c_choose_3 = _jspx_th_c_choose_3.doStartTag();
    if (_jspx_eval_c_choose_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_otherwise_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_3, _jspx_page_context))
          return true;
        out.write('\n');
        int evalDoAfterBody = _jspx_th_c_choose_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_3);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"billing_details\">\n");
        out.write("                            <div class=\"row\">\n");
        out.write("                                <div class=\"col-lg-8\">\n");
        out.write("                                    <h3>Billing Details</h3>\n");
        out.write("                                    <form class=\"row contact_form\" action=\"#\" method=\"post\" novalidate=\"novalidate\">\n");
        out.write("                                        <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                            <input type=\"text\" class=\"form-control\" id=\"first\" name=\"name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getFristName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"First name\"/>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                            <input type=\"text\" class=\"form-control\" id=\"last\" name=\"name\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getLastName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Last name\"/>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                            <input type=\"text\" class=\"form-control\" id=\"number\" name=\"number\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getPhone()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Phone number\"/>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                            <input type=\"text\" class=\"form-control\" id=\"email\" name=\"compemailany\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getEmail()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" placeholder=\"Email Address\"/>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"col-md-12 form-group p_star\">\n");
        out.write("                                            <input type=\"text\" class=\"form-control\" id=\"add1\" name=\"add1\" />\n");
        out.write("                                            <span class=\"placeholder\" data-placeholder=\"Country\"></span>\n");
        out.write("                                        </div>                             \n");
        out.write("                                        <div class=\"col-md-12 form-group\">\n");
        out.write("                                            <div class=\"creat_account\">\n");
        out.write("                                                <h3>Shipping Details</h3>\n");
        out.write("                                                <input type=\"checkbox\" id=\"f-option3\" name=\"selector\" />\n");
        out.write("                                                <label for=\"f-option3\">Ship to a different address?</label>\n");
        out.write("                                            </div>\n");
        out.write("                                            <textarea class=\"form-control\" name=\"message\" id=\"message\" rows=\"1\"\n");
        out.write("                                                      placeholder=\"Order Notes\"></textarea>\n");
        out.write("                                        </div>                               \n");
        out.write("                                    </form>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-lg-4\">\n");
        out.write("                                    <div class=\"order_box\">\n");
        out.write("                                        <h2>Your Order</h2>\n");
        out.write("                                        <ul class=\"list\">\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"#\">Product\n");
        out.write("                                                    <span>Total</span>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"#\">Fresh Blackberry\n");
        out.write("                                                    <span class=\"middle\">x 02</span>\n");
        out.write("                                                    <span class=\"last\">$720.00</span>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"#\">Fresh Tomatoes\n");
        out.write("                                                    <span class=\"middle\">x 02</span>\n");
        out.write("                                                    <span class=\"last\">$720.00</span>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"#\">Fresh Brocoli\n");
        out.write("                                                    <span class=\"middle\">x 02</span>\n");
        out.write("                                                    <span class=\"last\">$720.00</span>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                        </ul>\n");
        out.write("                                        <ul class=\"list list_2\">\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"#\">Subtotal\n");
        out.write("                                                    <span>$2160.00</span>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"#\">Shipping\n");
        out.write("                                                    <span>Flat rate: $50.00</span>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                            <li>\n");
        out.write("                                                <a href=\"#\">Total\n");
        out.write("                                                    <span>$2210.00</span>\n");
        out.write("                                                </a>\n");
        out.write("                                            </li>\n");
        out.write("                                        </ul>\n");
        out.write("                                        <div class=\"payment_item\" style=\"margin:20px 0\">\n");
        out.write("                                            <input type=\"text\" placeholder=\"Enter coupon code\" style=\"padding: 5px;\"/>\n");
        out.write("                                        </div>\n");
        out.write("                                        <h4>Phuong thuc thanh toan</h4>\n");
        out.write("                                        <div class=\"payment_item\">\n");
        out.write("                                            <div class=\"radion_btn\">\n");
        out.write("                                                <input type=\"radio\" id=\"f-option5\" name=\"selector\" />\n");
        out.write("                                                <label for=\"f-option5\">COD</label>\n");
        out.write("                                                <div class=\"check\"></div>\n");
        out.write("                                            </div>\n");
        out.write("                                            <p>\n");
        out.write("                                                Please send a check to Store Name, Store Street, Store Town,\n");
        out.write("                                                Store State / County, Store Postcode.\n");
        out.write("                                            </p>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"payment_item active\">\n");
        out.write("                                            <div class=\"radion_btn\">\n");
        out.write("                                                <input type=\"radio\" id=\"f-option6\" name=\"selector\" />\n");
        out.write("                                                <label for=\"f-option6\">Chuyen khoan</label>\n");
        out.write("                                                <img src=\"img/product/single-product/card.jpg\" alt=\"\" />\n");
        out.write("                                                <div class=\"check\"></div>\n");
        out.write("                                            </div>\n");
        out.write("                                            <p>\n");
        out.write("                                                Please send a check to Store Name, Store Street, Store Town,\n");
        out.write("                                                Store State / County, Store Postcode.\n");
        out.write("                                            </p>\n");
        out.write("                                        </div>\n");
        out.write("                                        <div class=\"creat_account\" style=\"font-size: 12px;\">\n");
        out.write("                                            <input type=\"checkbox\" id=\"f-option4\" name=\"selector\" />\n");
        out.write("                                            <label for=\"f-option4\">I’ve read and accept the </label>\n");
        out.write("                                            <a href=\"#\">terms & conditions*</a>\n");
        out.write("                                        </div>\n");
        out.write("                                        <a class=\"btn_3\" href=\"#\">Proceed to Paypal</a>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </section>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_3.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_3);
    int _jspx_eval_c_otherwise_3 = _jspx_th_c_otherwise_3.doStartTag();
    if (_jspx_eval_c_otherwise_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <div class=\"returning_customer\">\n");
        out.write("                    <div class=\"check_title\">\n");
        out.write("                        <h2>            \n");
        out.write("                            <a href=\"register.jsp\">Create new account</a>\n");
        out.write("                        </h2>\n");
        out.write("                    </div>\n");
        out.write("                    <p>\n");
        out.write("                        If you have shopped with us before, please enter your details in the\n");
        out.write("                        boxes below. If you are a new customer, please proceed to the\n");
        out.write("                        Billing & Shipping section.\n");
        out.write("                    </p>\n");
        out.write("                    <form class=\"row contact_form\" action=\"login?logId=2\" method=\"post\" novalidate=\"novalidate\">\n");
        out.write("                        <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                            <input type=\"text\" class=\"form-control\" id=\"username\" name=\"username\" placeholder=\"Username or Email\"/>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\"/>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"col-md-12 form-group\">\n");
        out.write("                            <button type=\"submit\" value=\"submit\" class=\"btn_3\">\n");
        out.write("                                log in\n");
        out.write("                            </button>\n");
        out.write("                            <div class=\"creat_account\">\n");
        out.write("                                <input type=\"checkbox\" id=\"f-option\" name=\"selector\" />\n");
        out.write("                                <label for=\"f-option\">Remember me</label>\n");
        out.write("                            </div>\n");
        out.write("                            <a class=\"lost_pass\" href=\"#\">Lost your password?</a>\n");
        out.write("                        </div>\n");
        out.write("                    </form>\n");
        out.write("                </div>\n");
        out.write("                <div class=\"billing_details\">\n");
        out.write("                    <div class=\"row\">\n");
        out.write("                        <div class=\"col-lg-8\">\n");
        out.write("                            <h3>Billing Details</h3>\n");
        out.write("                            <form class=\"row contact_form\" action=\"#\" method=\"post\" novalidate=\"novalidate\">\n");
        out.write("                                <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                    <input type=\"text\" class=\"form-control\" id=\"first\" name=\"name\" />\n");
        out.write("                                    <span class=\"placeholder\" data-placeholder=\"First name\"></span>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                    <input type=\"text\" class=\"form-control\" id=\"last\" name=\"name\" />\n");
        out.write("                                    <span class=\"placeholder\" data-placeholder=\"Last name\"></span>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                    <input type=\"text\" class=\"form-control\" id=\"number\" name=\"number\" />\n");
        out.write("                                    <span class=\"placeholder\" data-placeholder=\"Phone number\"></span>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-md-6 form-group p_star\">\n");
        out.write("                                    <input type=\"text\" class=\"form-control\" id=\"email\" name=\"compemailany\" />\n");
        out.write("                                    <span class=\"placeholder\" data-placeholder=\"Email Address\"></span>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-md-12 form-group p_star\">\n");
        out.write("                                    <select class=\"country_select\">\n");
        out.write("                                        <option value=\"1\">Country</option>\n");
        out.write("                                        <option value=\"2\">Country</option>\n");
        out.write("                                        <option value=\"4\">Country</option>\n");
        out.write("                                    </select>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-md-12 form-group p_star\">\n");
        out.write("                                    <input type=\"text\" class=\"form-control\" id=\"add1\" name=\"add1\" />\n");
        out.write("                                    <span class=\"placeholder\" data-placeholder=\"Huyen\"></span>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"col-md-12 form-group p_star\">\n");
        out.write("                                    <input type=\"text\" class=\"form-control\" id=\"city\" name=\"city\" />\n");
        out.write("                                    <span class=\"placeholder\" data-placeholder=\"Xa\"></span>\n");
        out.write("                                </div>                                \n");
        out.write("                                <div class=\"col-md-12 form-group\">\n");
        out.write("                                    <div class=\"creat_account\">\n");
        out.write("                                        <h3>Shipping Details</h3>\n");
        out.write("                                        <input type=\"checkbox\" id=\"f-option3\" name=\"selector\" />\n");
        out.write("                                        <label for=\"f-option3\">Ship to a different address?</label>\n");
        out.write("                                    </div>\n");
        out.write("                                    <textarea class=\"form-control\" name=\"message\" id=\"message\" rows=\"1\"\n");
        out.write("                                              placeholder=\"Order Notes\"></textarea>\n");
        out.write("                                </div>                               \n");
        out.write("                            </form>\n");
        out.write("                        </div>\n");
        out.write("                        <div class=\"col-lg-4\">\n");
        out.write("                            <div class=\"order_box\">\n");
        out.write("                                <h2>Your Order</h2>\n");
        out.write("                                <ul class=\"list\">\n");
        out.write("                                    <li>\n");
        out.write("                                        <a href=\"#\">Product\n");
        out.write("                                            <span>Total</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li>\n");
        out.write("                                        <a href=\"#\">Fresh Blackberry\n");
        out.write("                                            <span class=\"middle\">x 02</span>\n");
        out.write("                                            <span class=\"last\">$720.00</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li>\n");
        out.write("                                        <a href=\"#\">Fresh Tomatoes\n");
        out.write("                                            <span class=\"middle\">x 02</span>\n");
        out.write("                                            <span class=\"last\">$720.00</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li>\n");
        out.write("                                        <a href=\"#\">Fresh Brocoli\n");
        out.write("                                            <span class=\"middle\">x 02</span>\n");
        out.write("                                            <span class=\"last\">$720.00</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                </ul>\n");
        out.write("                                <ul class=\"list list_2\">\n");
        out.write("                                    <li>\n");
        out.write("                                        <a href=\"#\">Subtotal\n");
        out.write("                                            <span>$2160.00</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li>\n");
        out.write("                                        <a href=\"#\">Shipping\n");
        out.write("                                            <span>Flat rate: $50.00</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li>\n");
        out.write("                                        <a href=\"#\">Total\n");
        out.write("                                            <span>$2210.00</span>\n");
        out.write("                                        </a>\n");
        out.write("                                    </li>\n");
        out.write("                                </ul>\n");
        out.write("                                <div class=\"payment_item\" style=\"margin:20px 0\">\n");
        out.write("                                    <input type=\"text\" placeholder=\"Enter coupon code\" style=\"padding: 5px;\"/>\n");
        out.write("                                </div>\n");
        out.write("                                <h4>Phuong thuc thanh toan</h4>\n");
        out.write("                                <div class=\"payment_item\">\n");
        out.write("                                    <div class=\"radion_btn\">\n");
        out.write("                                        <input type=\"radio\" id=\"f-option5\" name=\"selector\" />\n");
        out.write("                                        <label for=\"f-option5\">COD</label>\n");
        out.write("                                        <div class=\"check\"></div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <p>\n");
        out.write("                                        Please send a check to Store Name, Store Street, Store Town,\n");
        out.write("                                        Store State / County, Store Postcode.\n");
        out.write("                                    </p>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"payment_item active\">\n");
        out.write("                                    <div class=\"radion_btn\">\n");
        out.write("                                        <input type=\"radio\" id=\"f-option6\" name=\"selector\" />\n");
        out.write("                                        <label for=\"f-option6\">Chuyen khoan</label>\n");
        out.write("                                        <img src=\"img/product/single-product/card.jpg\" alt=\"\" />\n");
        out.write("                                        <div class=\"check\"></div>\n");
        out.write("                                    </div>\n");
        out.write("                                    <p>\n");
        out.write("                                        Please send a check to Store Name, Store Street, Store Town,\n");
        out.write("                                        Store State / County, Store Postcode.\n");
        out.write("                                    </p>\n");
        out.write("                                </div>\n");
        out.write("                                <div class=\"creat_account\" style=\"font-size: 12px;\">\n");
        out.write("                                    <input type=\"checkbox\" id=\"f-option4\" name=\"selector\" />\n");
        out.write("                                    <label for=\"f-option4\">I’ve read and accept the </label>\n");
        out.write("                                    <a href=\"#\">terms & conditions*</a>\n");
        out.write("                                </div>\n");
        out.write("                                <a class=\"btn_3\" href=\"#\">Proceed to Paypal</a>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                    </div>\n");
        out.write("                </div>\n");
        out.write("            </div>\n");
        out.write("        </section>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_3);
    return false;
  }
}