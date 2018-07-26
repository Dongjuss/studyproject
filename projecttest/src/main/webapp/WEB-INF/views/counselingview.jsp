<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/template/top.jsp"%>


    <!-- end toggle top area -->
    <!-- start header -->

    <!-- end header -->
    
    <!-- 메뉴바 아래부분 부터 -->
    
    <section id="inner-headline">
    
      <div class="container">
        <div class="row">
          <div class="span4"> <!-- <div class="span4">  --> 
            <div class="inner-heading">
              <h2>View</h2>
            </div>
          </div>
          <div class="span8"> <!-- <div class="span8">  -->
            <ul class="breadcrumb">
              <li><a href="#"><i class="icon-home"></i></a><i class="icon-angle-right"></i></li>
              <li><a href="#">Blog</a><i class="icon-angle-right"></i></li>
              <li class="active">Blog with left sidebar</li>
            </ul>
          </div>
        </div>
      </div>
    </section>
    
    
	<%@ include file="/WEB-INF/views/commons/template/mypageleft.jsp"%>  
          
          <!--  -->
        <div class="span9 "> <!-- 이부분 --> <!--<div class="span8 ">  --> 

            <!--span8  -->
            <article>
              <div class="row">
                <div class="span9 "> <!-- <div class="span8 "> -->
                    <div class="post-heading">
                      <h3><a href="#">View</a></h3>
                    </div>
					<div>
						 <table class="table table-striped">
							<tr>
								<td>분류</td>
								<td colspan="2">  
									이용방법
								 </td>	
							</tr>
							<tr>
								<td>제목</td>
								<td colspan="2">파워링크 등록은 어떻게 하나요??</td>	
							</tr>						
							<tr>
								<td>내용</td>
								<td colspan="2">
								<textarea class="form-control" style="width: 600px; height: 200px;">
								파워링크 등록은 어떻게해야되나요 ??<br>
								어디서 하는지 모르겠습니다	
								</textarea>
								</td>	
							</tr>
																																																										
						</table>
						<div align="right">
						
						<input type="button" value="작성하기" class="btn">
						<a href="${root}/pagemove/mycounseling.project"><input type="button" value="취소" class="btn">
						</a>
						</div>
					
					</div>
					

                </div>
              </div>
            </article>
            
            
            



          </div>
        </div>
      </div>
    </section>

<%@ include file="/WEB-INF/views/commons/template/bottom.jsp"%>