<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/template/top.jsp"%>
    
    
    
    <!-- end header -->
    <section id="inner-headline">
      <div class="container" style="height: 100px;">
        <div class="row">
          <div class="span4">
            <div class="inner-heading">
              <h2>Counseling</h2>
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
    
<%@ include file="/WEB-INF/views/commons/template/mypageleft.jsp"%>  
          
          
          <div class="span9">

            
            
            <article>
              <div class="row">
                <div class="span9">
                    <div class="post-heading">
                      <h3><a href="#">Counseling</a></h3>
                    </div>
					
					<div>
				<form class="form-search">
                  <input placeholder="검색어 입력하세요!." type="text" class="input-medium search-query" style="width: 590px;">
                  <button type="submit" class="btn btn-square btn-theme">Search</button>
                </form>
						 <table class="table table-striped">
							<tr>
								<td>분류</td>
								<td>제목</td>
								<td>등록날짜</td>	
							</tr>
							
							<tr>
								<td>이용방법</td>
								<td><a href="${root}/pagemove/mycounselingview.project">파워링크 등록은 어떻게 하나요??</a></td>							
								<td>2018-07-24</td>
	
							</tr>		
									
																																									
						</table>
						<div align="right">
						<a href="${root}/pagemove/mycounselingwrite.project">
						<input type="button" value="글작성" class="button">
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
