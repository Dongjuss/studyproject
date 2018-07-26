<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/template/top.jsp"%>
    
    
    
    
    <!-- end header -->
    <section id="inner-headline">
      <div class="container">
        <div class="row">
          <div class="span4">
            <div class="inner-heading">
              <h2>Study List</h2>
            </div>
          </div>
          <div class="span8">
            <ul class="breadcrumb">
              <li><a href="#"><i class="icon-home"></i></a><i class="icon-angle-right"></i></li>
              <li><a href="#">Blog</a><i class="icon-angle-right"></i></li>
              <li class="active">Blog with left sidebar</li>
            </ul>
          </div>
        </div>
      </div>
    </section>
    
<%@ include file="/WEB-INF/views/commons/template/left.jsp"%>  
          
          <div class="span9">

            
            <article>
              <div class="row">
                <div class="span9">
                    <div class="post-heading">
                      <h3><a href="#">Study List</a></h3>
                    </div>
					<div>
						 <table class="table table-bordered">
							<tr>
								<td rowspan="4" width="20">사진</td>
								<td width="10%">제목</td>
								<td width="70%">안녕하세요</td>
							</tr>			
							<tr>
								
								<td width="10%">작성자</td>
								<td width="70%">김동주</td>
							</tr>																													
							<tr>
								
								<td width="10%">주제</td>
								<td width="70%">자격증</td>
							</tr>		
							<tr>
								
								<td width="10%">인원</td>
								<td width="70%">1/4</td>
							</tr>																																																							
						</table>
						<table class="table">
							<tr>
								<td>위치</td>
								<td colspan="2">경기도 안양시 만안구</td>
							</tr>
							<tr>								
								<td colspan="3">
								<textarea class="form-control" style="width: 600px; height: 200px;"></textarea>
								</td>
							</tr>
							
						</table>
						<div align="right">
						<input type="button" value="신청하기" class="btn">
						<a href="${root}/pagemove/studylist.project">
						<input type="button" value="뒤로가기" class="btn">
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