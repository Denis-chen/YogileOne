
<!Doctype html>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta property="qc:admins" content="465267610762567726375" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>JSP 动作元素 | 菜鸟教程</title>

  <link rel='dns-prefetch' href='//s.w.org' />
  <link rel="canonical" href="http://www.runoob.com/jsp/jsp-actions.html" />
  <meta name="keywords" content="JSP 动作元素">
  <meta name="description" content="JSP 动作元素  与JSP指令元素不同的是，JSP动作元素在请求处理阶段起作用。JSP动作元素是用XML语法写成的。 利用JSP动作可以动态地插入文件、重用JavaBean组件、把用户重定向到另外的页面、为Java插件生成HTML代码。  动作元素只有一种语法，它符合XML标准：    动作元素基本上都是预定义的函数，JSP规范定义了一系列的标准动作，它用JSP作为前缀，可用的标准动作元素如下：  语法 描述  jsp:include..">

  <link rel="shortcut icon" href="//static.runoob.com/images/favicon.ico" mce_href="//static.runoob.com/images/favicon.ico" type="image/x-icon" >
  <link rel="stylesheet" href="/wp-content/themes/runoob/style.css?v=1.153" type="text/css" media="all" />
  <link rel="stylesheet" href="https://cdn.staticfile.org/font-awesome/4.7.0/css/font-awesome.min.css" media="all" />
  <!--[if gte IE 9]><!-->
  <script src="//cdn.staticfile.org/jquery/2.0.3/jquery.min.js"></script>
  <!--<![endif]-->
  <!--[if lt IE 9]>
  <script src="//cdn.staticfile.org/jquery/1.9.1/jquery.min.js"></script>
  <script src="//cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
  <![endif]-->
  <link rel="apple-touch-icon" href="//static.runoob.com/images/icon/mobile-icon.png"/>
  <meta name="apple-mobile-web-app-title" content="菜鸟教程">
</head>
<body>

<!--  头部 -->
<div class="container logo-search">

  <div class="col search row-search-mobile">
    <form action="index.php">
      <input class="placeholder" placeholder="搜索……" name="s" autocomplete="off">
    </form>
  </div>

  <div class="row">
    <div class="col logo">
      <h1><a href="/">菜鸟教程 -- 学的不仅是技术，更是梦想！</a></h1>
    </div>
    <div class="col right-list">
      <button class="btn btn-responsive-nav btn-inverse" data-toggle="collapse" data-target=".nav-main-collapse" id="pull" style=""> <i class="fa fa-navicon"></i> </button>
    </div>
    <div class="col search search-desktop last">
      <form action="//www.runoob.com/" target="_blank">
        <input class="placeholder" id="s" name="s" placeholder="搜索……"  autocomplete="off">
      </form>
    </div>
  </div>
</div>


<!-- 导航栏 -->
<!-- 导航栏 -->
<div class="container navigation">
  <div class="row">
    <div class="col nav">
      <ul class="pc-nav">
        <li><a href="//www.runoob.com/">首页</a></li>
        <li><a href="/html/html-tutorial.html">HTML</a></li>
        <li><a href="/css/css-tutorial.html">CSS</a></li>
        <li><a href="/js/js-tutorial.html">JavaScript</a></li>
        <li><a href="/jquery/jquery-tutorial.html">jQuery</a></li>
        <li><a href="/bootstrap/bootstrap-tutorial.html">Bootstrap</a></li>
        <li><a href="/sql/sql-tutorial.html">SQL</a></li>
        <li><a href="/mysql/mysql-tutorial.html">MySQL</a></li>
        <li><a href="/php/php-tutorial.html">PHP</a></li>
        <li><a href="/python/python-tutorial.html">Python2</a></li>
        <li><a href="/python3/python3-tutorial.html">Python3</a></li>
        <li><a href="/cprogramming/c-tutorial.html">C</a></li>
        <li><a href="/cplusplus/cpp-tutorial.html">C++</a></li>
        <li><a href="/csharp/csharp-tutorial.html">C#</a></li>
        <li><a href="/java/java-tutorial.html">Java</a></li>
        <li><a href="/browser-history">本地书签</a></li>
        <!--
        <li><a href="/w3cnote/knowledge-start.html" style="font-weight: bold;" onclick="_hmt.push(['_trackEvent', '星球', 'click', 'start'])" title="我的圈子">我的圈子</a></li>
        <li><a href="javascript:;" class="runoob-pop">登录</a></li>
        -->
      </ul>
      <ul class="mobile-nav">
        <li><a href="//www.runoob.com/">首页</a></li>
        <li><a href="/html/html-tutorial.html">HTML</a></li>
        <li><a href="/css/css-tutorial.html">CSS</a></li>
        <li><a href="/js/js-tutorial.html">JS</a></li>
        <li><a href="/browser-history">本地书签</a></li>
        <a href="javascript:void(0)" class="search-reveal">Search</a>
      </ul>

    </div>
  </div>
</div><!--  内容  -->
<div class="container main">
  <!-- 中间 -->
  <div class="row">

    <div class="col left-column">
      <div class="tab">JSP 教程	<a data-cate="55" href="javascript:void(0);" title="夜间模式"  id="moon"><i class="fa fa-moon-o" aria-hidden="true" style="font-size: 1.4em;float: right;margin: 4px 6px 0;"></i></a>
        <a data-cate="55" style="display:none;" href="javascript:void(0);" title="日间模式"  id="sun" ><i class="fa fa-sun-o" aria-hidden="true" style="font-size: 1.4em;float: right;margin: 4px 6px 0;"></i></a>
      </div>
      <div class="sidebar-box gallery-list">
        <div class="design" id="leftcolumn">
          <a target="_top" title="JSP 教程"  href="/jsp/jsp-tutorial.html" >
            JSP 教程			</a>
          <a target="_top" title="JSP 简介"  href="/jsp/jsp-intro.html" >
            JSP 简介			</a>
          <a target="_top" title="JSP 开发环境搭建"  href="/jsp/jsp-setup.html" >
            JSP 开发环境搭建			</a>
          <a target="_top" title="Eclipse JSP/Servlet" href="/jsp/eclipse-jsp.html"> Eclipse JSP/Servlet</a>			<a target="_top" title="JSP 结构"  href="/jsp/jsp-architecture.html" >
          JSP 结构			</a>
          <a target="_top" title="JSP 生命周期"  href="/jsp/jsp-life-cycle.html" >
            JSP 生命周期			</a>
          <a target="_top" title="JSP 语法"  href="/jsp/jsp-syntax.html" >
            JSP 语法			</a>
          <a target="_top" title="JSP 指令"  href="/jsp/jsp-directives.html" >
            JSP 指令			</a>
          <a target="_top" title="JSP 动作元素"  href="/jsp/jsp-actions.html" >
            JSP 动作元素			</a>
          <a target="_top" title="JSP 隐式对象"  href="/jsp/jsp-implicit-objects.html" >
            JSP 隐式对象			</a>
          <a target="_top" title="JSP 客户端请求"  href="/jsp/jsp-client-request.html" >
            JSP 客户端请求			</a>
          <a target="_top" title="JSP 服务器响应"  href="/jsp/jsp-server-response.html" >
            JSP 服务器响应			</a>
          <a target="_top" title="JSP HTTP 状态码"  href="/jsp/jsp-http-status-codes.html" >
            JSP HTTP 状态码			</a>
          <a target="_top" title="JSP 表单处理"  href="/jsp/jsp-form-processing.html" >
            JSP 表单处理			</a>
          <a target="_top" title="JSP 过滤器"  href="/jsp/jsp-writing-filters.html" >
            JSP 过滤器			</a>
          <a target="_top" title="JSP Cookie 处理"  href="/jsp/jsp-cookies.html" >
            JSP Cookie 处理			</a>
          <a target="_top" title="JSP Session"  href="/jsp/jsp-session.html" >
            JSP Session			</a>
          <a target="_top" title="JSP 文件上传"  href="/jsp/jsp-file-uploading.html" >
            JSP 文件上传			</a>
          <a target="_top" title="JSP 日期处理"  href="/jsp/jsp-handling-date.html" >
            JSP 日期处理			</a>
          <a target="_top" title="JSP 页面重定向"  href="/jsp/jsp-page-redirect.html" >
            JSP 页面重定向			</a>
          <a target="_top" title="JSP 点击量统计"  href="/jsp/jsp-hits-counter.html" >
            JSP 点击量统计			</a>
          <a target="_top" title="JSP 自动刷新"  href="/jsp/jsp-auto-refresh.html" >
            JSP 自动刷新			</a>
          <a target="_top" title="JSP 发送邮件"  href="/jsp/jsp-sending-email.html" >
            JSP 发送邮件			</a>
          <br><h2 class="left"><span class="left_h2">JSP 高级教程</span></h2>			<a target="_top" title="JSP 标准标签库（JSTL）"  href="/jsp/jsp-jstl.html" >
          JSP 标准标签库（JSTL）			</a>
          <a target="_top" title="JSP 连接数据库"  href="/jsp/jsp-database-access.html" >
            JSP 连接数据库			</a>
          <a target="_top" title="JSP XML 数据处理"  href="/jsp/jsp-xml-data.html" >
            JSP XML 数据处理			</a>
          <a target="_top" title="JSP JavaBean"  href="/jsp/jsp-javabean.html" >
            JSP JavaBean			</a>
          <a target="_top" title="JSP 自定义标签"  href="/jsp/jsp-custom-tags.html" >
            JSP 自定义标签			</a>
          <a target="_top" title="JSP 表达式语言"  href="/jsp/jsp-expression-language.html" >
            JSP 表达式语言			</a>
          <a target="_top" title="JSP 异常处理"  href="/jsp/jsp-exception-handling.html" >
            JSP 异常处理			</a>
          <a target="_top" title="JSP 调试"  href="/jsp/jsp-debugging.html" >
            JSP 调试			</a>
          <a target="_top" title="JSP 国际化"  href="/jsp/jsp-internationalization.html" >
            JSP 国际化			</a>

        </div>
      </div>
    </div>	<div class="col middle-column">


    <div class="article">
      <div class="article-heading-ad" style="display: none;">

      </div>
      <div class="previous-next-links">
        <div class="previous-design-link"><i style="font-size:16px;" class="fa fa-arrow-left" aria-hidden="true"></i> <a href="http://www.runoob.com/jsp/jsp-directives.html" rel="prev"> JSP 指令</a> </div>
        <div class="next-design-link"><a href="http://www.runoob.com/jsp/jsp-implicit-objects.html" rel="next"> JSP 隐式对象</a> <i style="font-size:16px;" class="fa fa-arrow-right" aria-hidden="true"></i></div>
      </div>
      <div class="article-body">

        <div class="article-intro" id="content">

          <h1>JSP <span class="color_h1">动作元素</span></h1>
          <p>
            与JSP指令元素不同的是，JSP动作元素在请求处理阶段起作用。JSP动作元素是用XML语法写成的。</p>
          <p>利用JSP动作可以动态地插入文件、重用JavaBean组件、把用户重定向到另外的页面、为Java插件生成HTML代码。 </p>
          <p>动作元素只有一种语法，它符合XML标准：</p>
          <pre>
&lt;jsp:action_name attribute="value" /&gt;
</pre>
          <p>动作元素基本上都是预定义的函数，JSP规范定义了一系列的标准动作，它用JSP作为前缀，可用的标准动作元素如下：</p>
          <table class="reference">
            <tbody><tr><th style="width:30%">语法 </th><th>描述 </th></tr>
            <tr><td>jsp:include</td><td>在页面被请求的时候引入一个文件。 </td></tr>
            <tr><td>jsp:useBean</td><td>寻找或者实例化一个JavaBean。 </td></tr>
            <tr><td>jsp:setProperty</td><td>设置JavaBean的属性。 </td></tr>
            <tr><td>jsp:getProperty</td><td>输出某个JavaBean的属性。 </td></tr>
            <tr><td>jsp:forward</td><td>把请求转到一个新的页面。 </td></tr>
            <tr><td>jsp:plugin</td><td>根据浏览器类型为Java插件生成OBJECT或EMBED标记。 </td></tr>
            <tr><td>jsp:element</td><td>定义动态XML元素</td></tr>
            <tr><td>jsp:attribute</td><td>设置动态定义的XML元素属性。</td></tr>
            <tr><td>jsp:body</td><td>设置动态定义的XML元素内容。</td></tr>
            <tr><td>jsp:text</td><td>在JSP页面和文档中使用写入文本的模板</td></tr>
            </tbody></table>
          <hr>
          <h2>常见的属性</h2>
          <p>
            所有的动作要素都有两个属性：id属性和scope属性。
          </p>
          <ul><li><strong>
            id属性：</strong><p>id属性是动作元素的唯一标识，可以在JSP页面中引用。动作元素创建的id值可以通过PageContext来调用。
            <p></li><li><strong>
            scope属性：</strong><p></strong>该属性用于识别动作元素的生命周期。 id属性和scope属性有直接关系，scope属性定义了相关联id对象的寿命。 scope属性有四个可能的值： (a) page, (b)request, (c)session, 和 (d) application。

            <p></li></ul>
          <hr>
          <h2> &lt;jsp:include&gt;动作元素  </h2>
          <p>  &lt;jsp:include&gt;动作元素用来包含静态和动态的文件。该动作把指定文件插入正在生成的页面。语法格式如下：</p>
          <pre>
&lt;jsp:include page="相对 URL 地址" flush="true" /&gt;
</pre>
          <p>　前面已经介绍过include指令，它是在JSP文件被转换成Servlet的时候引入文件，而这里的jsp:include动作不同，插入文件的时间是在页面被请求的时候。
          </p>
          <p>以下是include动作相关的属性列表。</p>
          <table class="reference">
            <tbody><tr><th style="width:30%">属性 </th><th>描述 </th></tr>
            <tr><td>page</td><td>包含在页面中的相对URL地址。</td></tr>
            <tr><td>flush</td><td>布尔属性，定义在包含资源前是否刷新缓存区。</td></tr>
            </tbody></table>
          <h3>实例</h3>
          <p>以下我们定义了两个文件 <strong>date.jsp</strong> 和 <strong>main.jsp</strong>，代码如下所示：</p>
          <p>date.jsp文件代码：</p>
          <pre>
&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;p&gt;
   今天的日期是: &lt;%= (new java.util.Date()).toLocaleString()%&gt;
&lt;/p&gt;
</pre>
          <p>main.jsp文件代码：</p>
          <pre>
&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta charset="utf-8"&gt;
&lt;title&gt;菜鸟教程(runoob.com)&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;

&lt;h2&gt;include 动作实例&lt;/h2&gt;
&lt;jsp:include page="date.jsp" flush="true" /&gt;

&lt;/body&gt;
&lt;/html&gt;
</pre>
          <p>现在将以上两个文件放在服务器的根目录下，访问main.jsp文件。显示结果如下：</p>
          <pre>
include 动作实例

今天的日期是: 2016-6-25 14:08:17
</pre>
          <hr>
          <h2>&lt;jsp:useBean&gt;动作元素</h2>
          <p><strong>jsp:useBean</strong> 动作用来加载一个将在JSP页面中使用的JavaBean。</p>
          <p>这个功能非常有用，因为它使得我们可以发挥 Java 组件复用的优势。</p>
          <p>jsp:useBean动作最简单的语法为：
          </p>
          <pre>
&lt;jsp:useBean id="name" class="package.class" /&gt;
</pre>
          <p>
            在类载入后，我们既可以通过 jsp:setProperty 和 jsp:getProperty 动作来修改和检索bean的属性。
          </p>
          <p>以下是useBean动作相关的属性列表。</p>
          <table class="reference">
            <tbody><tr><th style="width:30%">属性 </th><th>描述 </th></tr>
            <tr><td>class</td><td>指定Bean的完整包名。</td></tr>
            <tr><td>type</td><td>指定将引用该对象变量的类型。</td></tr>
            <tr><td>beanName</td><td>通过 java.beans.Beans 的 instantiate() 方法指定Bean的名字。</td></tr>
            </tbody></table>
          <p>在给出具体实例前，让我们先来看下 jsp:setProperty 和 jsp:getProperty 动作元素：</p>
          <hr>
          <h2> &lt;jsp:setProperty&gt;动作元素</h2>
          <p>jsp:setProperty用来设置已经实例化的Bean对象的属性，有两种用法。首先，你可以在jsp:useBean元素的外面（后面）使用jsp:setProperty，如下所示：
          </p>
          <pre>
&lt;jsp:useBean id="myName" ... /&gt;
...
&lt;jsp:setProperty name="myName" property="someProperty" .../&gt;
</pre>
          <p>此时，不管jsp:useBean是找到了一个现有的Bean，还是新创建了一个Bean实例，jsp:setProperty都会执行。第二种用法是把jsp:setProperty放入jsp:useBean元素的内部，如下所示：
          </p>
          <pre>
&lt;jsp:useBean id="myName" ... &gt;
...
   &lt;jsp:setProperty name="myName" property="someProperty" .../&gt;
&lt;/jsp:useBean&gt;
</pre>
          <p>此时，jsp:setProperty只有在新建Bean实例时才会执行，如果是使用现有实例则不执行jsp:setProperty。
          </p>
          <p>jsp:setProperty动作有下面四个属性,如下表：</p>
          <table class="reference">
            <tbody><tr><th style="width:30%">属性 </th><th>描述 </th></tr>
            <tr><td>name</td><td>name属性是必需的。它表示要设置属性的是哪个Bean。  </td></tr>
            <tr><td>property</td><td>property属性是必需的。它表示要设置哪个属性。有一个特殊用法：如果property的值是"*"，表示所有名字和Bean属性名字匹配的请求参数都将被传递给相应的属性set方法。 </td></tr>
            <tr><td>value</td><td> value 属性是可选的。该属性用来指定Bean属性的值。字符串数据会在目标类中通过标准的valueOf方法自动转换成数字、boolean、Boolean、 byte、Byte、char、Character。例如，boolean和Boolean类型的属性值（比如"true"）通过 Boolean.valueOf转换，int和Integer类型的属性值（比如"42"）通过Integer.valueOf转换。
              　　value和param不能同时使用，但可以使用其中任意一个。 </td></tr>
            <tr><td>param</td><td> param 是可选的。它指定用哪个请求参数作为Bean属性的值。如果当前请求没有参数，则什么事情也不做，系统不会把null传递给Bean属性的set方法。因此，你可以让Bean自己提供默认属性值，只有当请求参数明确指定了新值时才修改默认属性值。 </td></tr>
            </tbody></table>
          <hr>
          <h2>&lt;jsp:getProperty&gt;动作元素</h2>
          <p>jsp:getProperty动作提取指定Bean属性的值，转换成字符串，然后输出。语法格式如下：</p>
          <pre>
&lt;jsp:useBean id="myName" ... /&gt;
...
&lt;jsp:getProperty name="myName" property="someProperty" .../&gt;
</pre>
          <p>下表是与getProperty相关联的属性：</p>
          <table class="reference">
            <tbody><tr><th style="width:30%">属性 </th><th>描述 </th></tr>
            <tr><td>name</td><td>要检索的Bean属性名称。Bean必须已定义。</td></tr>
            <tr><td>property</td><td>表示要提取Bean属性的值</td></tr>
            </tbody></table>
          <h3>实例</h3>
          <p>以下实例我们使用了Bean:</p>
          <pre>
package com.runoob.main;

public class TestBean {
   private String message = "菜鸟教程";
 
   public String getMessage() {
      return(message);
   }
   public void setMessage(String message) {
      this.message = message;
   }
}
</pre>

          <p>编译以上实例文件 TestBean.java ：</p>
          <pre>
$ javac TestBean.java
</pre>
          <p>编译完成后会在当前目录下生成一个 <strong>TestBean.class</strong> 文件，
            将该文件拷贝至当前 JSP 项目的 <strong>WebContent/WEB-INF/classes/com/runoob/main</strong>
            下( com/runoob/main 包路径，没有需要手动创建)。
          </p>
          <p>下面是一个 Eclipse 中目录结构图：</p>
          <p><img  width="70%" src="//www.runoob.com/wp-content/uploads/2014/01/6AC33FBA-0B76-4BFD-A690-E856E9E01900.jpg"></p>
          <p>下面是一个很简单的例子，它的功能是装载一个Bean，然后设置/读取它的message属性。 </p>
          </p>
          <p>现在让我们在main.jsp文件中调用该Bean:</p>
          <pre>
&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta charset="utf-8"&gt;
&lt;title&gt;菜鸟教程(runoob.com)&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;

&lt;h2&gt;Jsp 使用 JavaBean 实例&lt;/h2&gt;
&lt;jsp:useBean id="test" class="com.runoob.main.TestBean" /&gt;
 
&lt;jsp:setProperty name="test" 
                    property="message" 
                    value="菜鸟教程..." /&gt;
 
&lt;p&gt;输出信息....&lt;/p&gt;
 
&lt;jsp:getProperty name="test" property="message" /&gt;

&lt;/body&gt;
&lt;/html&gt;
</pre>
          <p>浏览器访问，执行以上文件，输出如下所示：</p>
          <p>
            <img width="70%" src="//www.runoob.com/wp-content/uploads/2014/01/D7AD87A8-3392-4D4E-8731-18806B0644CD.jpg"></p>
          <hr>
          <h2>&lt;jsp:forward&gt; 动作元素</h2>
          <p>　jsp:forward动作把请求转到另外的页面。jsp:forward标记只有一个属性page。语法格式如下所示：
          </p>
          <pre>
&lt;jsp:forward page="相对 URL 地址" /&gt;
</pre>
          <p>以下是forward相关联的属性：</p>
          <table class="reference">
            <tbody><tr><th style="width:30%">属性 </th><th>描述 </th></tr>
            <tr><td>page</td><td>page属性包含的是一个相对URL。page的值既可以直接给出，也可以在请求的时候动态计算，可以是一个JSP页面或者一个 Java Servlet.</td></tr>
            </tbody></table>
          <h3>实例</h3>
          <p>以下实例我们使用了两个文件，分别是： date.jsp 和 main.jsp。</p>
          <p> date.jsp 文件代码如下：</p>
          <pre>
&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;p&gt;
   今天的日期是: &lt;%= (new java.util.Date()).toLocaleString()%&gt;
&lt;/p&gt;
</pre>
          <p>main.jsp文件代码：</p>
          <pre>
&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta charset="utf-8"&gt;
&lt;title&gt;菜鸟教程(runoob.com)&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;

&lt;h2&gt;forward 动作实例&lt;/h2&gt;
&lt;jsp:forward page="date.jsp" /&gt;
&lt;/body&gt;
&lt;/html&gt;
</pre>
          <p>现在将以上两个文件放在服务器的根目录下，访问main.jsp文件。显示结果如下：</p>
          <pre>
今天的日期是: 2016-6-25 14:37:25
</pre>
          <hr>
          <h2> &lt;jsp:plugin&gt;动作元素</h2>
          <p>jsp:plugin动作用来根据浏览器的类型，插入通过Java插件 运行Java Applet所必需的OBJECT或EMBED元素。</p>
          <p>如果需要的插件不存在，它会下载插件，然后执行Java组件。 Java组件可以是一个applet或一个JavaBean。 </p>
          <p>plugin动作有多个对应HTML元素的属性用于格式化Java 组件。param元素可用于向Applet 或 Bean 传递参数。</p>
          <p>以下是使用plugin 动作元素的典型实例:</p>
          <pre>
&lt;jsp:plugin type="applet" codebase="dirname" code="MyApplet.class"
                           width="60" height="80"&gt;
   &lt;jsp:param name="fontcolor" value="red" /&gt;
   &lt;jsp:param name="background" value="black" /&gt;
 
   &lt;jsp:fallback&gt;
      Unable to initialize Java Plugin
   &lt;/jsp:fallback&gt;
 
&lt;/jsp:plugin&gt;
</pre>
          <p>如果你有兴趣可以尝试使用applet来测试jsp:plugin动作元素，&lt;fallback&gt;元素是一个新元素，在组件出现故障的错误时发送给用户错误信息。</p>
          <hr><h2>
          &lt;jsp:element&gt; 、
          &lt;jsp:attribute&gt;、
          &lt;jsp:body&gt;动作元素</h2>
          <p>&lt;jsp:element&gt; 、
            &lt;jsp:attribute&gt;、
            &lt;jsp:body&gt;动作元素动态定义XML元素。动态是非常重要的，这就意味着XML元素在编译时是动态生成的而非静态。</p>
          <p>以下实例动态定义了XML元素：</p>
          <pre>
&lt;%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%&gt;
&lt;!DOCTYPE html&gt;
&lt;html&gt;
&lt;head&gt;
&lt;meta charset="utf-8"&gt;
&lt;title&gt;菜鸟教程(runoob.com)&lt;/title&gt;
&lt;/head&gt;
&lt;body&gt;
&lt;jsp:element name="xmlElement"&gt;
&lt;jsp:attribute name="xmlElementAttr"&gt;
   属性值
&lt;/jsp:attribute&gt;
&lt;jsp:body&gt;
   XML 元素的主体
&lt;/jsp:body&gt;
&lt;/jsp:element&gt;
&lt;/body&gt;
&lt;/html&gt;
</pre>
          <p>浏览器访问以下页面，输出结果如下所示：</p>
          <p>
            <img width="70%" src="//www.runoob.com/wp-content/uploads/2014/01/7D8C47F0-0DDE-4F1D-8BE1-B2C9C955683E.jpg">
          </p>
          <hr>
          <h2>&lt;jsp:text&gt;动作元素</h2>
          <p>&lt;jsp:text&gt;动作元素允许在JSP页面和文档中使用写入文本的模板，语法格式如下：</p>
          <pre>
&lt;jsp:text&gt;模板数据&lt;/jsp:text&gt;
</pre>
          <p>以上文本模板不能包含重复元素，只能包含文本和EL表达式（注：EL表达式将在后续章节中介绍）。请注意，在XML文件中，您不能使用表达式如 ${whatever &gt; 0}，因为&gt;符号是非法的。
            你可以使用 ${whatever gt 0}表达式或者嵌入在一个CDATA部分的值。
          </p>
          <pre>
&lt;jsp:text&gt;&lt;![CDATA[&lt;br&gt;]]&gt;&lt;/jsp:text&gt;
</pre>
          <p>如果你需要在 XHTML 中声明 DOCTYPE,必须使用到&lt;jsp:text&gt;动作元素，实例如下：</p>
          <pre>
&lt;jsp:text&gt;&lt;![CDATA[&lt;!DOCTYPE html
PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
"DTD/xhtml1-strict.dtd"&gt;]]&gt;
&lt;/jsp:text&gt;
&lt;head&gt;&lt;title&gt;jsp:text action&lt;/title&gt;&lt;/head&gt;
&lt;body&gt;

&lt;books&gt;&lt;book&gt;&lt;jsp:text&gt;  
    Welcome to JSP Programming
&lt;/jsp:text&gt;&lt;/book&gt;&lt;/books&gt;

&lt;/body&gt;
&lt;/html&gt;
</pre>
          <p>你可以对以上实例尝试使用&lt;jsp:text&gt;及不使用该动作元素执行结果的区别。</p>			<!-- 其他扩展 -->

        </div>

      </div>

      <div class="previous-next-links">
        <div class="previous-design-link"><i style="font-size:16px;" class="fa fa-arrow-left" aria-hidden="true"></i> <a href="http://www.runoob.com/jsp/jsp-directives.html" rel="prev"> JSP 指令</a> </div>
        <div class="next-design-link"><a href="http://www.runoob.com/jsp/jsp-implicit-objects.html" rel="next"> JSP 隐式对象</a> <i style="font-size:16px;" class="fa fa-arrow-right" aria-hidden="true"></i></div>
      </div>
      <!-- 笔记列表 -->
      <style>
        .wrapper {
          /*text-transform: uppercase; */
          background: #ececec;
          color: #555;
          cursor: help;
          font-family: "Gill Sans", Impact, sans-serif;
          font-size: 20px;
          position: relative;
          text-align: center;
          width: 200px;
          -webkit-transform: translateZ(0); /* webkit flicker fix */
          -webkit-font-smoothing: antialiased; /* webkit text rendering fix */
        }

        .wrapper .tooltip {
          white-space: nowrap;
          font-size: 14px;
          text-align: left;
          background: #96b97d;
          bottom: 100%;
          color: #fff;
          display: block;
          left: -25px;
          margin-bottom: 15px;
          opacity: 0;
          padding: 14px;
          pointer-events: none;
          position: absolute;

          -webkit-transform: translateY(10px);
          -moz-transform: translateY(10px);
          -ms-transform: translateY(10px);
          -o-transform: translateY(10px);
          transform: translateY(10px);
          -webkit-transition: all .25s ease-out;
          -moz-transition: all .25s ease-out;
          -ms-transition: all .25s ease-out;
          -o-transition: all .25s ease-out;
          transition: all .25s ease-out;
          -webkit-box-shadow: 2px 2px 6px rgba(0, 0, 0, 0.28);
          -moz-box-shadow: 2px 2px 6px rgba(0, 0, 0, 0.28);
          -ms-box-shadow: 2px 2px 6px rgba(0, 0, 0, 0.28);
          -o-box-shadow: 2px 2px 6px rgba(0, 0, 0, 0.28);
          box-shadow: 2px 2px 6px rgba(0, 0, 0, 0.28);
        }
        .tooltip a {
          color:#fff;
        }
        /* This bridges the gap so you can mouse into the tooltip without it disappearing */
        .wrapper .tooltip:before {
          bottom: -20px;
          content: " ";
          display: block;
          height: 20px;
          left: 0;
          position: absolute;
          width: 100%;
        }

        /* CSS Triangles - see Trevor's post */
        .wrapper .tooltip:after {
          border-left: solid transparent 10px;
          border-right: solid transparent 10px;
          border-top: solid #96b97d 10px;
          bottom: -10px;
          content: " ";
          height: 0;
          left: 20%;
          margin-left: -13px;
          position: absolute;
          width: 0;
        }
        .wrapper .tooltip1 {
          margin-left: 50px;
          padding-top: 0px;
        }
        /*
        .wrapper:hover .tooltip {
          opacity: 1;
          pointer-events: auto;
          -webkit-transform: translateY(0px);
             -moz-transform: translateY(0px);
              -ms-transform: translateY(0px);
               -o-transform: translateY(0px);
                  transform: translateY(0px);
        }
        */
        /* IE can just show/hide with no transition */
        .lte8 .wrapper .tooltip {
          display: none;
        }

        .lte8 .wrapper:hover .tooltip {
          display: block;
        }

      </style>

      <div id="respond" class="no_webshot">
        <div class="comment-signarea" style=" padding: 20px 20px;">
          <h3 class="text-muted" id="share_code" style="color: #799961;"><i class="fa fa-pencil-square-o" aria-hidden="true"></i> 点我分享笔记</h3>
          <!--
          <p style="font-size:14px;">笔记需要是本篇文章的内容扩展！</p><br>
          <p style="font-size:12px;"><a href="//www.runoob.com/tougao" target="_blank">文章投稿，可点击这里</a></p>
          <p style="font-size:14px;"><a href="/w3cnote/runoob-user-test-intro.html#invite" target="_blank">注册邀请码获取方式</a></p>
              <h3 class="text-muted"><i class="fa fa-info-circle" aria-hidden="true"></i> 分享笔记前必须<a href="javascript:;" class="runoob-pop">登录</a>！</h3>
              <p><a href="/w3cnote/runoob-user-test-intro.html#invite" target="_blank">注册邀请码获取方式</a></p>-->
        </div>

        <form action="/wp-content/themes/runoob/option/addnote.php" method="post" id="commentform" style="display:none;">
          <div class="comt">
            <div class="comt-title">
              <i style="font-size:36px;" class="fa fa-user-circle" aria-hidden="true"></i>				<p><a id="cancel-comment-reply-link" href="javascript:;">取消</a></p>
            </div>
            <div class="comt-box">
              <div id="mded"></div>

              <div class="comt-ctrl">
                <div class="comt-tips"><input type='hidden' name='comment_post_ID' value='5186' id='comment_post_ID' />
                  <input type='hidden' name='comment_parent' id='comment_parent' value='0' />
                </div>
                <button type="submit" name="submit" id="submit" tabindex="5"><i class="fa fa-pencil" aria-hidden="true"></i> 分享笔记</button>
              </div>
            </div>


            <div class="comt-comterinfo">
              <ul id="comment-author-info">
                <li class="form-inline"><label class="hide" for="author">昵称</label><input class="ipt" type="text" name="author" id="author" value="" tabindex="2" placeholder="昵称"><span class="text-muted">昵称 (必填)</span></li>
                <li class="form-inline"><label class="hide" for="email">邮箱</label><input class="ipt" type="text" name="email" id="email" value="" tabindex="3" placeholder="邮箱"><span class="text-muted">邮箱 (必填)</span></li>
                <li class="form-inline"><label class="hide" for="url">引用地址</label><input class="ipt" type="text" name="url" id="url" value="" tabindex="4" placeholder="引用地址"><span class="text-muted">引用地址</span></li>
              </ul>
            </div>


          </div>

        </form>
      </div>
      <script type="text/javascript">
          $(function() {
              //初始化编辑器

              var editor = new Simditor({
                  textarea: $('#mded'),
                  placeholder: '写笔记...',
                  upload:false,
                  // upload: {url:'/api/comment_upload_file.php',params: null,fileKey: 'upload_file',connectionCount: 1,leaveConfirm: '文件正在上传，您确定离开?'},
                  defaultImage: 'http://www.runoob.com/images/logo.png',
                  codeLanguages: '',
                  toolbar: [  'bold','code','ul','ol','image' ]
              });
              editor.on('selectionchanged', function() {
                  $(".code-popover").hide();
              });

              // 提交数据
              $("#share_code").click(function() {
                  $(".comment-signarea").hide();
                  $("#commentform").show();

              });
              $("#user_add_note").click(function() {
                  $(".comment-signarea").hide();
                  $("#commentform").show();
                  $('html, body').animate({
                      scrollTop: $("#respond").offset().top
                  }, 200);
              });

              // 提交笔记
              var commentform=$('#commentform');
              commentform.prepend('<div id="comment-status" style="display:none;" ></div>');
              var statusdiv=$('#comment-status');

              commentform.submit(function(e){
                  e.preventDefault();
                  var noteContent = editor.getValue();
                  // console.log(noteContent);
                  noteContent = noteContent.replace(/<pre><code>/g,"<pre>");
                  noteContent = noteContent.replace(/<\/code><\/pre>/g,"</pre>");

                  // 系列化表单数据
                  var comment_parent = 0;
                  var is_user_logged_in = $("#is_user_logged_in").val();
                  var comment_post_ID =  5186;
                  var _wp_unfiltered_html_comment = $("#_wp_unfiltered_html_comment").val();
                  var comment = noteContent;
                  var author = $("#author").val();
                  var url = $("#url").val();
                  var email = $("#email").val();
                  if(isBlank(author) && is_user_logged_in==0) {
                      statusdiv.html('<p  class="ajax-error">请输入昵称！</p>').show();
                  } else if(isBlank(email)  && is_user_logged_in==0) {
                      statusdiv.html('<p  class="ajax-error">请输入邮箱！</p>').show();
                  } else {
                      // var formdata=commentform.serialize() + "&comment=" + noteContent ;
                      // 添加状态信息
                      statusdiv.html('<p>Processing...</p>').show();
                      // 获取表单提交地址
                      var formurl=commentform.attr('action');

                      // 异步提交
                      $.ajax({
                          type: 'post',
                          url: formurl,
                          dataType:'json',
                          data: {"comment_parent":comment_parent,"comment_post_ID":comment_post_ID, "_wp_unfiltered_html_comment":_wp_unfiltered_html_comment,"comment":comment,"url":url, "email":email,"author":author},
                          error: function(XMLHttpRequest, textStatus, errorThrown){
                              statusdiv.html('<p class="ajax-error" >数据不完整或表单提交太快了！</p>').show();
                          },
                          success: function(data, textStatus){
                              if(data.errorno=="0") {
                                  $("#submit").prop('disabled', true);
                                  statusdiv.html('<p class="ajax-success" >笔记已提交审核，感谢分享笔记！</p>').show();
                                  alert('笔记已提交审核，感谢分享笔记！');
                              }else{
                                  statusdiv.html('<p class="ajax-error" >'+data.msg+'</p>').show();
                              }
                              commentform.find('textarea[name=comment]').val('');
                          }
                      });
                      setTimeout(function(){
                          $("#submit").prop('disabled', false);
                      }, 10*1000);
                  }
                  return false;

              });
              $(".comt-author").hover(function(){
                  $(this).children(".tooltip").css({ "opacity": 1, "pointer-events": "auto"});
              },function(){
                  $(this).children(".tooltip").css({ "opacity": 0, "pointer-events": "auto"});
              });
              $(".wrapper i").hover(function(){
                  $(this).siblings(".tooltip").css({ "opacity": 1, "pointer-events": "auto"});
              },function(){
                  $(this).siblings(".tooltip").css({ "opacity": 0, "pointer-events": "auto"});
              });
              //Upvote.create('runoobvote-id', {callback: vote_callback});
              var ajaxurl = 'http://www.runoob.com/wp-admin/admin-ajax.php';
              var callback = function(data) {
                  //console.log($('#runoobvote-id').upvote('upvoted'));
                  //console.log($('#runoobvote-id').upvote('downvoted'));
                  //console.log(data);
                  _vote_action = data.action;
                  console.log(_vote_action);
                  id_arr = data.id.split('-');
                  um_id= id_arr[2];
                  //console.log(um_id);

                  var re = /^[1-9]+/;
                  if (re.test(um_id)) {
                      var ajax_data = {
                          _vote_action: _vote_action,
                          action: "pinglun_zan",
                          um_id: um_id,
                          um_action: "ding"
                      };
                      //console.log(ajax_data);
                      $.post(ajaxurl,ajax_data,function(status){
                          //console.log("Data: " + data + "nStatus: " + status);
                      });
                  }
              };
              $('.upvotejs').upvote({id: 5186, callback: callback});
              $.post(ajaxurl,{"action":"pinglun_zan","postid":5186},function(data){
                  $(data).each(function(key,value) {
                      $("#runoobvote-id-" + value.commid + " .upvote").addClass(value.upvotejs_class);
                      $("#runoobvote-id-" + value.commid + " .downvote").addClass(value.downvote_class);
                      $("#runoobvote-id-" + value.commid + " .count").addClass(value.upvote_count)
                  })
              },'json');
          });
          function isBlank(str) {
              return (!str || /^\s*$/.test(str));
          }


      </script>

      <link rel="stylesheet" href="https://static.runoob.com/assets/upvotejs/dist/upvotejs/upvotejs.css">
      <script src="https://static.runoob.com/assets/upvotejs/dist/upvotejs/upvotejs.vanilla.js"></script>
      <script src="https://static.runoob.com/assets/upvotejs/dist/upvotejs/upvotejs.jquery.js"></script>
      <link rel="stylesheet" href="/wp-content/themes/runoob/assets/css/qa.css?1.43">
      <link rel="stylesheet" type="text/css" href="//cdn.staticfile.org/simditor/2.3.6/styles/simditor.min.css" />
      <script type="text/javascript" src="//static.runoob.com/assets/simditor/2.3.6/scripts/module.js"></script>
      <script type="text/javascript" src="//static.runoob.com/assets/simditor/2.3.6/scripts/hotkeys.js"></script>
      <script type="text/javascript" src="//static.runoob.com/assets/simditor/2.3.6/scripts/uploader.js"></script>
      <script type="text/javascript" src="//cdn.staticfile.org/simditor/2.3.6/lib/simditor.min.js"></script>		<div class="sidebar-box ad-box ad-box-large">
      <div id="ad-336280">
        <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
        <!-- 移动版 自动调整 -->
        <ins class="adsbygoogle"
             style="display:block"
             data-ad-client="ca-pub-5751451760833794"
             data-ad-slot="1691338467"
             data-ad-format="auto"></ins>
        <script>
            (adsbygoogle = window.adsbygoogle || []).push({});
        </script>
      </div>
    </div>

    </div>
  </div>


    <!-- 右边栏 -->
    <div class="fivecol last right-column">
      <!--
          <div class="tab tab-light-blue" style="text-align: center;">关注微信</div>
          <div class="sidebar-box">
              <a href="http://m.runoob.com/" target="_blank"> <img src="http://www.runoob.com/wp-content/themes/w3cschool.cc/assets/img/qrcode.jpg" alt="移动版"> </a>
              <div class="qqinfo">
               <a target="_blank" href="http://jq.qq.com/?_wv=1027&k=dOwwKN" id="qqhref">
              <img border="0" src="http://pub.idqqimg.com/wpa/images/group.png" alt="菜鸟家族" title="菜鸟家族"></a>
              <span>(群号：<span id="qqid">365967760</span>)</span>
              </div>

          </div>
          -->
      <style>
        .sidebar-tree .double-li {
          width:300px;
        }
        .sidebar-tree .double-li li {
          width: 44%;
          line-height: 1.5em;
          border-bottom: 1px solid #ccc;
          float: left;
          display: inline;
        }
      </style>


      <div class="sidebar-box ad-box ad-box-large">
        <div class="sidebar-box advertise-here" style="margin: 0 auto;">
          <a href="javascript:void(0);" style="font-size: 16px; color:#64854c;font-weight:bold;"> <i class="fa fa-list" aria-hidden="true"></i> 分类导航</a>
        </div>
        <div class="sidebar-box sidebar-cate">

          <div class="sidebar-tree" >
            <ul><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> HTML / CSS</a><ul class="double-li"><li><a title="HTML 教程" href="//www.runoob.com/html/html-tutorial.html">HTML 教程</a></li><li><a title="HTML5 教程" href="//www.runoob.com/html/html5-intro.html">HTML5 教程</a></li><li><a title="CSS 教程" href="//www.runoob.com/css/css-tutorial.html">CSS 教程</a></li><li><a title="CSS3 教程" href="//www.runoob.com/css3/css3-tutorial.html">CSS3 教程</a></li><li><a title="Bootstrap3 教程" href="//www.runoob.com/bootstrap/bootstrap-tutorial.html">Bootstrap3 教程</a></li><li><a title="Bootstrap4 教程" href="//www.runoob.com/bootstrap4/bootstrap4-tutorial.html">Bootstrap4 教程</a></li><li><a title="Font Awesome 教程" href="//www.runoob.com/font-awesome/fontawesome-tutorial.html">Font Awesome 教程</a></li><li><a title="Foundation 教程" href="//www.runoob.com/foundation/foundation-tutorial.html">Foundation 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> JavaScript</a><ul class="double-li"><li><a title="JavaScript 教程" href="//www.runoob.com/js/js-tutorial.html">JavaScript 教程</a></li><li><a title="HTML DOM 教程" href="//www.runoob.com/htmldom/htmldom-tutorial.html">HTML DOM 教程</a></li><li><a title="jQuery 教程" href="//www.runoob.com/jquery/jquery-tutorial.html">jQuery 教程</a></li><li><a title="AngularJS 教程" href="//www.runoob.com/angularjs/angularjs-tutorial.html">AngularJS 教程</a></li><li><a title="AngularJS2 教程" href="//www.runoob.com/angularjs2/angularjs2-tutorial.html">AngularJS2 教程</a></li><li><a title="Vue.js 教程" href="//www.runoob.com/vue2/vue-tutorial.html">Vue.js 教程</a></li><li><a title="React 教程" href="//www.runoob.com/react/react-tutorial.html">React 教程</a></li><li><a title="TypeScript 教程" href="//www.runoob.com/typescript/ts-tutorial.html">TypeScript 教程</a></li><li><a title="jQuery UI 教程" href="//www.runoob.com/jqueryui/jqueryui-tutorial.html">jQuery UI 教程</a></li><li><a title="jQuery EasyUI 教程" href="//www.runoob.com/jeasyui/jqueryeasyui-tutorial.html">jQuery EasyUI 教程</a></li><li><a title="Node.js 教程" href="//www.runoob.com/nodejs/nodejs-tutorial.html">Node.js 教程</a></li><li><a title="AJAX 教程" href="//www.runoob.com/ajax/ajax-tutorial.html">AJAX 教程</a></li><li><a title="JSON 教程" href="//www.runoob.com/json/json-tutorial.html">JSON 教程</a></li><li><a title="Highcharts 教程" href="//www.runoob.com/highcharts/highcharts-tutorial.html">Highcharts 教程</a></li><li><a title="Google 地图 教程" href="//www.runoob.com/googleapi/google-maps-basic.html">Google 地图 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> 服务端</a><ul class="double-li"><li><a title="PHP 教程" href="//www.runoob.com/php/php-tutorial.html">PHP 教程</a></li><li><a title="Python 教程" href="//www.runoob.com/python/python-tutorial.html">Python 教程</a></li><li><a title="Python3 教程" href="//www.runoob.com/python3/python3-tutorial.html">Python3 教程</a></li><li><a title="Django 教程" href="//www.runoob.com/django/django-tutorial.html">Django 教程</a></li><li><a title="Linux 教程" href="//www.runoob.com/linux/linux-tutorial.html">Linux 教程</a></li><li><a title="Docker 教程" href="//www.runoob.com/docker/docker-tutorial.html">Docker 教程</a></li><li><a title="Ruby 教程" href="//www.runoob.com/ruby/ruby-tutorial.html">Ruby 教程</a></li><li><a title="Java 教程" href="//www.runoob.com/java/java-tutorial.html">Java 教程</a></li><li><a title="C 教程" href="//www.runoob.com/c/c-tutorial.html">C 教程</a></li><li><a title="C++ 教程" href="//www.runoob.com/cplusplus/cpp-tutorial.html">C++ 教程</a></li><li><a title="Perl 教程" href="//www.runoob.com/perl/perl-tutorial.html">Perl 教程</a></li><li><a title="Servlet 教程" href="//www.runoob.com/servlet/servlet-tutorial.html">Servlet 教程</a></li><li><a title="JSP 教程" href="//www.runoob.com/jsp/jsp-tutorial.html">JSP 教程</a></li><li><a title="Lua 教程" href="//www.runoob.com/lua/lua-tutorial.html">Lua 教程</a></li><li><a title="Scala 教程" href="//www.runoob.com/scala/scala-tutorial.html">Scala 教程</a></li><li><a title="Go 教程" href="//www.runoob.com/go/go-tutorial.html">Go 教程</a></li><li><a title="设计模式" href="//www.runoob.com/design-pattern/design-pattern-tutorial.html">设计模式</a></li><li><a title="正则表达式" href="//www.runoob.com/regexp/regexp-tutorial.html">正则表达式</a></li><li><a title="Maven 教程" href="//www.runoob.com/maven/maven-tutorial.html">Maven 教程</a></li><li><a title="NumPy 教程" href="//www.runoob.com/numpy/numpy-tutorial.html">NumPy 教程</a></li><li><a title="ASP 教程" href="//www.runoob.com/asp/asp-tutorial.html">ASP 教程</a></li><li><a title="AppML 教程" href="//www.runoob.com/appml/appml-tutorial.html">AppML 教程</a></li><li><a title="VBScript 教程" href="//www.runoob.com/vbscript/vbscript-tutorial.html">VBScript 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> 数据库</a><ul class="double-li"><li><a title="SQL 教程" href="//www.runoob.com/sql/sql-tutorial.html">SQL 教程</a></li><li><a title="Mysql 教程" href="//www.runoob.com/mysql/mysql-tutorial.html">Mysql 教程</a></li><li><a title="PostgreSQL 教程" href="//www.runoob.com/postgresql/postgresql-tutorial.html">PostgreSQL 教程</a></li><li><a title="SQLite 教程" href="//www.runoob.com/sqlite/sqlite-tutorial.html">SQLite 教程</a></li><li><a title="MongoDB 教程" href="//www.runoob.com/mongodb/mongodb-tutorial.html">MongoDB 教程</a></li><li><a title="Redis 教程" href="//www.runoob.com/redis/redis-tutorial.html">Redis 教程</a></li><li><a title="Memcached 教程" href="//www.runoob.com/Memcached/Memcached-tutorial.html">Memcached 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> 移动端</a><ul class="double-li"><li><a title="Android 教程" href="//www.runoob.com/w3cnote/android-tutorial-intro.html">Android 教程</a></li><li><a title="Swift 教程" href="//www.runoob.com/swift/swift-tutorial.html">Swift 教程</a></li><li><a title="jQuery Mobile 教程" href="//www.runoob.com/jquerymobile/jquerymobile-tutorial.html">jQuery Mobile 教程</a></li><li><a title="ionic 教程" href="//www.runoob.com/ionic/ionic-tutorial.html">ionic 教程</a></li><li><a title="Kotlin 教程" href="//www.runoob.com/kotlin/kotlin-tutorial.html">Kotlin 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> XML 教程</a><ul class="double-li"><li><a title="XML 教程" href="//www.runoob.com/xml/xml-tutorial.html">XML 教程</a></li><li><a title="DTD 教程" href="//www.runoob.com/dtd/dtd-tutorial.html">DTD 教程</a></li><li><a title="XML DOM 教程" href="//www.runoob.com/dom/dom-tutorial.html">XML DOM 教程</a></li><li><a title="XSLT 教程" href="//www.runoob.com/xsl/xsl-tutorial.html">XSLT 教程</a></li><li><a title="XPath 教程" href="//www.runoob.com/xpath/xpath-tutorial.html">XPath 教程</a></li><li><a title="XQuery 教程" href="//www.runoob.com/xquery/xquery-tutorial.html">XQuery 教程</a></li><li><a title="XLink 教程" href="//www.runoob.com/xlink/xlink-tutorial.html">XLink 教程</a></li><li><a title="XPointer 教程" href="//www.runoob.com/xlink/xlink-tutorial.html">XPointer 教程</a></li><li><a title="XML Schema 教程" href="//www.runoob.com/schema/schema-tutorial.html">XML Schema 教程</a></li><li><a title="XSL-FO 教程" href="//www.runoob.com/xslfo/xslfo-tutorial.html">XSL-FO 教程</a></li><li><a title="SVG 教程" href="//www.runoob.com/svg/svg-tutorial.html">SVG 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> ASP.NET</a><ul class="double-li"><li><a title="ASP.NET 教程" href="//www.runoob.com/aspnet/aspnet-tutorial.html">ASP.NET 教程</a></li><li><a title="C# 教程" href="//www.runoob.com/csharp/csharp-tutorial.html">C# 教程</a></li><li><a title="Web Pages 教程" href="//www.runoob.com/aspnet/webpages-intro.html">Web Pages 教程</a></li><li><a title="Razor 教程" href="//www.runoob.com/aspnet/razor-intro.html">Razor 教程</a></li><li><a title="MVC 教程" href="//www.runoob.com/aspnet/mvc-intro.html">MVC 教程</a></li><li><a title="Web Forms 教程" href="//www.runoob.com/aspnet/aspnet-intro.html">Web Forms 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> Web Service</a><ul class="double-li"><li><a title="Web Service 教程" href="//www.runoob.com/webservices/webservices-tutorial.html">Web Service 教程</a></li><li><a title="WSDL 教程" href="//www.runoob.com/wsdl/wsdl-tutorial.html">WSDL 教程</a></li><li><a title="SOAP 教程" href="//www.runoob.com/soap/soap-tutorial.html">SOAP 教程</a></li><li><a title="RSS 教程" href="//www.runoob.com/rss/rss-tutorial.html">RSS 教程</a></li><li><a title="RDF 教程" href="//www.runoob.com/rdf/rdf-tutorial.html">RDF 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> 开发工具</a><ul class="double-li"><li><a title="Eclipse 教程" href="//www.runoob.com/eclipse/eclipse-tutorial.html">Eclipse 教程</a></li><li><a title="Git 教程" href="//www.runoob.com/git/git-tutorial.html">Git 教程</a></li><li><a title="Svn 教程" href="//www.runoob.com/svn/svn-tutorial.html">Svn 教程</a></li><li><a title="Markdown 教程" href="//www.runoob.com/markdown/md-tutorial.html">Markdown 教程</a></li></ul></li><li style="margin: 0;"><a href="javascript:void(0);" class="tit"> 网站建设</a><ul class="double-li"><li><a title="HTTP 教程" href="//www.runoob.com/http/http-tutorial.html">HTTP 教程</a></li><li><a title="网站建设指南" href="//www.runoob.com/web/web-buildingprimer.html">网站建设指南</a></li><li><a title="浏览器信息" href="//www.runoob.com/browsers/browser-information.html">浏览器信息</a></li><li><a title="网站主机教程" href="//www.runoob.com/hosting/hosting-tutorial.html">网站主机教程</a></li><li><a title="TCP/IP 教程" href="//www.runoob.com/tcpip/tcpip-tutorial.html">TCP/IP 教程</a></li><li><a title="W3C 教程" href="//www.runoob.com/w3c/w3c-tutorial.html">W3C 教程</a></li><li><a title="网站品质" href="//www.runoob.com/quality/quality-tutorial.html">网站品质</a></li></ul></li></ul>			</div>

        </div>
      </div>
      <br>

      <div class="sidebar-box ad-box ad-box-large">
        <div class="sidebar-box advertise-here">
          <a href="javascript:void(0);">Advertisement</a>
        </div>
        <div class="ad-600160" id="sidebar-right-ads">
          <script async src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
          <!-- 侧栏1 -->
          <ins class="adsbygoogle"
               style="display:inline-block;width:160px;height:600px"
               data-ad-client="ca-pub-5751451760833794"
               data-ad-slot="4106274865"></ins>
          <script>
              (adsbygoogle = window.adsbygoogle || []).push({});
          </script>
        </div>
      </div>
    </div></div>

</div>

<script>
    var aid = 5186;
    function coll() {
        $.post( '/wp-content/themes/runoob/option/user/userinfo.php', {aid:aid, action:"collarticle", opt:'add'},function( data ) {
            if(data.error==0) {
                $("#content").find("h1:first").find("a").attr("href","javascript:void(0);");
                $("#content").find("h1:first").find("img").attr("src","http://www.runoob.com/wp-content/themes/runoob/assets/img/coll2.png").css({width:32+"px",height:32+"px"});
            }
            alert(data.msg);
        },'json');
    }
</script>


<!-- 反馈对话框开始 -->
<script src="/wp-content/themes/runoob/assets/feedback/stable/2.0/feedback.js?1.0"></script>
<link rel="stylesheet" href="/wp-content/themes/runoob/assets/feedback/stable/2.0/feedback.css?1.0" />
<script type="text/javascript">
    $.feedback({
        ajaxURL: '/feedback/runoob_feedback.php',
        html2canvasURL: '/wp-content/themes/runoob/assets/feedback/stable/2.0/html2canvas.js'
    });
</script>
<!-- 反馈对话框结束 -->
<button class="feedback-btn feedback-btn-gray">反馈/建议</button>
<!-- 底部 -->


<div id="footer" class="mar-t50">
  <div class="runoob-block">
    <div class="runoob cf">
      <dl>
        <dt>
          在线实例
        </dt>
        <dd>
          &middot;<a target="_blank" href="/html/html-examples.html">HTML 实例</a>
        </dd>
        <dd>
          &middot;<a target="_blank" href="/css/css-examples.html">CSS 实例</a>
        </dd>
        <dd>
          &middot;<a target="_blank" href="/js/js-examples.html">JavaScript 实例</a>
        </dd>
        <dd>
          &middot;<a target="_blank" href="/ajx/ajax-examples.html">Ajax 实例</a>
        </dd>
        <dd>
          &middot;<a target="_blank" href="/jquery/jquery-examples.html">jQuery 实例</a>
        </dd>
        <dd>
          &middot;<a target="_blank" href="/xml/xml-examples.html">XML 实例</a>
        </dd>
        <dd>
          &middot;<a target="_blank" href="/java/java-examples.html">Java 实例</a>
        </dd>

      </dl>
      <dl>
        <dt>
          字符集&工具
        </dt>
        <dd>
          &middot; <a target="_blank" href="/charsets/html-charsets.html">HTML 字符集设置</a>
        </dd>
        <dd>
          &middot; <a target="_blank" href="/tags/html-ascii.html">HTML ASCII 字符集</a>
        </dd>
        <dd>
          &middot; <a target="_blank" href="/tags/ref-entities.html">HTML ISO-8859-1</a>
        </dd>
        <dd>
          &middot; <a target="_blank" href="/tags/html-symbols.html">HTML 实体符号</a>
        </dd>
        <dd>
          &middot; <a target="_blank" href="/tags/html-colorpicker.html">HTML 拾色器</a>
        </dd>
        <dd>
          &middot; <a target="_blank" href="//c.runoob.com/front-end/53">JSON 格式化工具</a>
        </dd>
      </dl>
      <dl>
        <dt>
          最新更新
        </dt>
        <dd>
          &middot;
          <a href="http://www.runoob.com/w3cnote/builder-pattern-2.html" title="设计模式：Builder模式">设计模式：Build...</a>
        </dd>
        <dd>
          &middot;
          <a href="http://www.runoob.com/w3cnote/builder-pattern.html" title="设计模式之建造者(Builder)模式">设计模式之建造...</a>
        </dd>
        <dd>
          &middot;
          <a href="http://www.runoob.com/w3cnote/vmwear-install-centos7.html" title="VMwear 安装 Centos7 超详细过程">VMwear 安装 Cen...</a>
        </dd>
        <dd>
          &middot;
          <a href="http://www.runoob.com/w3cnote/python-tower.html" title="Python 汉诺塔">Python 汉诺塔</a>
        </dd>
        <dd>
          &middot;
          <a href="http://www.runoob.com/w3cnote/shell-process-substitution.html" title="shell 里的进程替换(Process Substitution)">shell 里的进程...</a>
        </dd>
        <dd>
          &middot;
          <a href="http://www.runoob.com/w3cnote/closure-intro.html" title="什么是闭包？闭包的优缺点？">什么是闭包？闭...</a>
        </dd>
        <dd>
          &middot;
          <a href="http://www.runoob.com/python3/python3-assert.html" title="Python3 assert（断言）">Python3 assert...</a>
        </dd>
      </dl>
      <dl>
        <dt>
          站点信息
        </dt>
        <dd>
          &middot;
          <a target="_blank" href="//mail.qq.com/cgi-bin/qm_share?t=qm_mailme&amp;email=ssbDyoOAgfLU3crf09venNHd3w" rel="external nofollow">意见反馈</a>
        </dd>

        <dd>
          &middot;
          <a class="wxpopup" onclick="popFunction()">合作联系
            <span class="popuptext" id="myPopup">微信(注明来意)：<strong>centos5</strong></span>
          </a>
        </dd>
        <dd>
          &middot;
          <a target="_blank" href="/disclaimer">免责声明</a>
        </dd>
        <!--
        <dd style="display: block;">
        &middot;
       <a href="javascript:void(0)" onclick="dashangToggle()" style="font-weight:bold;color:#f00;" title="打赏，支持一下">打赏一下</a>
        </dd>
      -->
        <dd>
          &middot;
          <a target="_blank" href="/aboutus">关于我们</a>
        </dd>
        <dd>
          &middot;
          <a target="_blank" href="/archives">文章归档</a>
        </dd>

      </dl>

      <div class="search-share">
        <div class="app-download">
          <div>
            <strong>关注微信</strong>
          </div>
        </div>
        <div class="share">
          <img width="128" height="128" src="/wp-content/themes/runoob/assets/images/qrcode.png" />
        </div>
      </div>

    </div>
  </div>
  <div class="w-1000 copyright">
    Copyright &copy; 2013-2019    <strong><a href="//www.runoob.com/" target="_blank">菜鸟教程</a></strong>&nbsp;
    <strong><a href="//www.runoob.com/" target="_blank">runoob.com</a></strong> All Rights Reserved. 备案号：闽ICP备15012807号-1
  </div>
</div>
<div class="fixed-btn">
  <a class="go-top" href="javascript:void(0)" title="返回顶部"> <i class="fa fa-angle-up"></i></a>
  <a class="qrcode"  href="javascript:void(0)" title="关注我们"><i class="fa fa-qrcode"></i></a>
  <a class="writer" style="display:none" href="javascript:void(0)"   title="标记/收藏"><i class="fa fa-star" aria-hidden="true"></i></a>
  <!-- qrcode modal -->
  <div id="bottom-qrcode" class="modal panel-modal hide fade in">
    <h4>微信关注</h4>
    <div class="panel-body"><img alt="微信关注" width="128" height="128" src="/wp-content/themes/runoob/assets/images/qrcode.png"></div>
  </div>
</div>

<div class="hide_box"></div>
<div class="shang_box">
  <a class="shang_close" href="javascript:void(0)" onclick="dashangToggle()" title="关闭"><img src="//static.runoob.com/images/dashang/close.jpg" alt="取消" /></a>

  <div class="shang_tit">
    <p>感谢您的支持，我会继续努力的!</p>
  </div>
  <div class="shang_payimg">
    <img src="//static.runoob.com/images/dashang/weipayimg.png" alt="扫码支持" title="扫一扫" />
  </div>
  <div class="pay_explain">扫码打赏，你说多少就多少</div>
  <div class="shang_payselect">
    <div class="pay_item  checked" data-id="weipay">
      <span class="radiobox"></span>
      <span class="pay_logo"><img src="//static.runoob.com/images/dashang/wechat.jpg" alt="微信" /></span>
    </div>
    <div class="pay_item" data-id="alipay">
      <span class="radiobox"></span>
      <span class="pay_logo"><img src="//static.runoob.com/images/dashang/alipay.jpg" alt="支付宝" /></span>
    </div>

  </div>
  <div class="shang_info">
    <p>打开<span id="shang_pay_txt">支付宝</span>扫一扫，即可进行扫码打赏哦</p>
    <p><a href="//c.runoob.com/codedemo/5348" target="_blank"><span style=" font-size: 14px;color: #000;font-weight: bold;">点我查看本站打赏源码！</span></a></p>
  </div>
</div>
<div id="testClick"></div>
<div style="display:none;">

  <script>
      var _hmt = _hmt || [];
      (function() {
          var hm = document.createElement("script");
          hm.src = "https://hm.baidu.com/hm.js?3eec0b7da6548cf07db3bc477ea905ee";
          var s = document.getElementsByTagName("script")[0];
          s.parentNode.insertBefore(hm, s);
      })();
  </script>
  <script async src="https://www.googletagmanager.com/gtag/js?id=UA-84264393-2"></script>
  <script>
      window.dataLayer = window.dataLayer || [];
      function gtag(){dataLayer.push(arguments);}
      gtag('js', new Date());

      gtag('config', 'UA-84264393-2');
  </script>
</div>
<script>
    window.jsui={
        www: '//www.runoob.com',
        uri: '//www.runoob.com/wp-content/themes/runoob'
    };
</script>
<style>
  ol,ul{list-style:none}.cd-switcher a{text-decoration:none;outline:0}.cd-switcher a:hover{text-decoration:underline}a:focus{outline:0;-moz-outline:0}.main_nav{width:300px;height:60px;margin:60px auto 10px auto}.main_nav li{float:left;width:60px;margin-right:10px;font-size:16px;padding:.6em 1em;border-radius:3em;background:#2f889a;text-align:center}.main_nav li a{color:#fff}.errtip{background-color:#fceaea;color:#db5353;padding:8px 15px;font-size:14px;border:1px solid #fc9797;border-radius:5px}.cd-user-modal{position:fixed;top:0;left:0;width:100%;height:100%;background:rgba(52,54,66,0.9);z-index:3;overflow-y:auto;cursor:pointer;visibility:hidden;opacity:0;-webkit-transition:opacity .3s 0,visibility 0 .3s;-moz-transition:opacity .3s 0,visibility 0 .3s;transition:opacity .3s 0,visibility 0 .3s}.cd-user-modal.is-visible{visibility:visible;opacity:1;-webkit-transition:opacity .3s 0,visibility 0 0;-moz-transition:opacity .3s 0,visibility 0 0;transition:opacity .3s 0,visibility 0 0}.cd-user-modal.is-visible .cd-user-modal-container{-webkit-transform:translateY(0);-moz-transform:translateY(0);-ms-transform:translateY(0);-o-transform:translateY(0);transform:translateY(0)}.cd-user-modal-container{position:relative;width:90%;max-width:500px;background:#FFF;margin:3em auto 4em;cursor:auto;border-radius:.25em;-webkit-transform:translateY(-30px);-moz-transform:translateY(-30px);-ms-transform:translateY(-30px);-o-transform:translateY(-30px);transform:translateY(-30px);-webkit-transition-property:-webkit-transform;-moz-transition-property:-moz-transform;transition-property:transform;-webkit-transition-duration:.3s;-moz-transition-duration:.3s;transition-duration:.3s}.cd-user-modal-container .cd-switcher:after{content:"";display:table;clear:both}.cd-user-modal-container .cd-switcher li{width:50%;float:left;text-align:center}.cd-user-modal-container .cd-switcher li:first-child a{border-radius:.25em 0 0 0}.cd-user-modal-container .cd-switcher li:last-child a{border-radius:0 .25em 0 0}.cd-user-modal-container .cd-switcher a{font-size:1.2em;font-weight:bold;display:block;width:100%;height:50px;line-height:50px;background:#e8f1e2;color:#96b880}.cd-user-modal-container .cd-switcher a.selected{background:#FFF;color:#505260}@media only screen and (min-width:600px){.cd-user-modal-container{margin:4em auto}.cd-user-modal-container .cd-switcher a{height:70px;line-height:70px}}.cd-form{padding:1.4em}.cd-form .fieldset{position:relative;margin:1.4em 0}.cd-form .fieldset:first-child{margin-top:0}.cd-form .fieldset:last-child{margin-bottom:0}.cd-form label{font-size:16px;font-size:.875rem}.cd-form label.image-replace{display:inline-block;position:absolute;left:15px;top:50%;bottom:auto;-webkit-transform:translateY(-50%);-moz-transform:translateY(-50%);-ms-transform:translateY(-50%);-o-transform:translateY(-50%);transform:translateY(-50%);height:20px;width:20px;overflow:hidden;text-indent:100%;white-space:nowrap;color:transparent;text-shadow:none;background-repeat:no-repeat;background-position:50% 0}.cd-form label.cd-username{background-image:url("/wp-content/themes/runoob/assets/img/cd-icon-username.svg")}.cd-form label.cd-email{background-image:url("/wp-content/themes/runoob/assets/img/cd-icon-email.svg")}.cd-form label.cd-password{background-image:url("/wp-content/themes/runoob/assets/img/cd-icon-password.svg")}.cd-form input{margin:0;padding:0;border-radius:.25em}.cd-form input.full-width{width:80%}.cd-form input.full-width2{width:94%}.cd-form input.has-padding{padding:12px 20px 12px 50px}.cd-form input.has-border{border:1px solid #d2d8d8;-webkit-appearance:none;-moz-appearance:none;-ms-appearance:none;-o-appearance:none;appearance:none}.cd-form input.has-border:focus{border-color:#98b880;box-shadow:0 0 5px rgba(52,54,66,0.1);outline:0}.cd-form input.has-error{border:1px solid #d76666}.cd-form input[type=password]{padding-right:65px}.cd-form input[type=submit]{padding:16px 0;cursor:pointer;background:#96b97d;color:#FFF;font-weight:bold;border:0;-webkit-appearance:none;-moz-appearance:none;-ms-appearance:none;-o-appearance:none;appearance:none;font-size:1.2em;font-weight:bold}.no-touch .cd-form input[type=submit]:hover,.no-touch .cd-form input[type=submit]:focus{background:#3599ae;outline:0}@media only screen and (min-width:600px){.cd-form{padding:2em}.cd-form .fieldset{margin:2em 0}.cd-form .fieldset:first-child{margin-top:0}.cd-form .fieldset:last-child{margin-bottom:0}.cd-form input.has-padding{padding:16px 20px 16px 50px}.cd-form input[type=submit]{padding:16px 0}}.cd-close-form{display:block;position:absolute;width:40px;height:40px;right:0;top:-40px;background:url("/wp-content/themes/runoob/assets/img/cd-icon-close.svg") no-repeat center center;text-indent:100%;white-space:nowrap;overflow:hidden}@media only screen and (min-width:1170px){}#cd-login,#cd-signup,#cd-reset-password{display:none}#cd-login.is-selected,#cd-signup.is-selected,#cd-reset-password.is-selected{display:block}
</style>
<div class="cd-user-modal">
  <div class="cd-user-modal-container">
    <ul class="cd-switcher">
      <li><a href="javascript:;">用户登录</a></li>
      <li><a href="javascript:;">注册新用户</a></li>
    </ul>

    <div id="cd-login"> <!-- 登录表单 -->
      <div class="cd-form">
        <p class="fieldset">
          <label class="image-replace cd-username" for="signin-username">用户名</label>
          <input class="full-width has-padding has-border" id="signin-username" name=username type="text" placeholder="输入用户名">
        </p>

        <p class="fieldset">
          <label class="image-replace cd-password" for="signin-password">密码</label>
          <input class="full-width has-padding has-border" id="signin-password" name="password" type="password"  placeholder="输入密码">
        </p>

        <p class="fieldset">
          <input type="checkbox" id="remember-me" checked>
          <label for="remember-me">记住登录状态</label>
          <a href="//www.runoob.com/reset-password" style="float: right;padding-right: 20px;" target="_blank">忘记密码？</a>
        </p>
        <input type="hidden" name="action" value="signin">
        <p class="fieldset">
          <input class="full-width2" type="submit" value="登 录">
        </p>
        <div class="err-msg"></div>
      </div>
    </div>

    <div id="cd-signup"> <!-- 注册表单 -->
      <div class="cd-form">
        <p class="fieldset">
          <label class="image-replace cd-password" for="verifycode">邀请码</label>
          <input class="full-width has-padding has-border" id="signup-verifycode" name="verifycode" type="text"  placeholder="输入邀请码">
        </p>
        <p class="fieldset">
          <label class="image-replace cd-username" for="signup-username">用户名</label>
          <input class="full-width has-padding has-border" id="signup-username" name="name" type="text" placeholder="输入用户名">
        </p>

        <p class="fieldset">
          <label class="image-replace cd-email" for="signup-email">邮箱</label>
          <input class="full-width has-padding has-border" name="email" id="signup-email" type="email" placeholder="输入mail">
        </p>

        <p class="fieldset">
          <label class="image-replace cd-password" for="signup-password">密码</label>
          <input class="full-width has-padding has-border" id="signup-password" name="password" type="password"  placeholder="输入密码">
        </p>
        <p class="fieldset">
          <label class="image-replace cd-password" for="signup-password2">重复输入密码</label>
          <input class="full-width has-padding has-border" id="signup-password2" name="password2" type="password"  placeholder="重复输入密码">
        </p>

        <!--
        <p class="fieldset">
            <input type="checkbox" id="accept-terms">
            <label for="accept-terms">我已阅读并同意 <a href="javascript:;">用户协议</a></label>
        </p>
         -->

        <input type="hidden" name="action" value="signup">
        <p class="fieldset">
          <input class="full-width2" type="submit" value="注册新用户">
        </p>
        <p class="fieldset">
          <a href="//www.runoob.com/w3cnote/runoob-user-test-intro.html#invite" target="_blank">如何获取邀请码？</a>
        </p>
        <div class="err-msg"></div>
      </div>

    </div>

    <a href="javascript:;" class="cd-close-form">关闭</a>
  </div>
</div>
<script src="/wp-content/themes/runoob/assets/js/main.min.js?v=1.189"></script>
<script src="//static.runoob.com/assets/libs/hl/run_prettify.js"></script>
</body>
</html>