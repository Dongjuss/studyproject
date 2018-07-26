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
              <h2>Study Create</h2>
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
    
    
	<%@ include file="/WEB-INF/views/commons/template/left.jsp"%>  
          
          <!--  -->
        <div class="span9 "> <!-- 이부분 --> <!--<div class="span8 ">  --> 

            <!--span8  -->
            <article>
              <div class="row">
                <div class="span9 "> <!-- <div class="span8 "> -->
                    <div class="post-heading">
                      <h3><a href="#">Study Create</a></h3>
                    </div>
					<div>
						 <table class="table table-striped">
							<tr>
								<td>제목</td>
								<td colspan="2"><input type="text" style="width: 600px;"></td>	
							</tr>
							<tr>
								<td>작성자</td>
								<td colspan="2"><input type="text" style="width: 600px;"></td>	
							</tr>							
							<tr>
								<td>인원수</td>
								<td colspan="2">  
								<select class="form-control" >
								    <option>1</option>
								    <option>2</option>
								    <option>3</option>
								    <option>4</option>
								    <option>5</option>
								    <option>6</option>
								    <option>7</option>
								    <option>8</option>
								  </select>
								  </td>	
							</tr>
							<tr>
								<td>위치</td>
								<td><input type="text"></td>	
								<td><img src="${root}/img/map.png" width="40" height="20"></td>
							</tr>
							<tr>
								<td>주제</td>
								<td colspan="2"><input type="text" style="width: 600px;"></td>	
							</tr>
							<tr>
								<td>내용</td>
								<td colspan="2"><textarea class="form-control" style="width: 600px; height: 200px;"></textarea></td>	
							</tr>
							<tr>
								<td>사진첨부</td>
								<td><input type="text"></td>	
								<td><input type="file" value="첨부파일" >
							</tr>																								
																																									
						</table>
						<div align="right">
						<a href="${root}/pagemove/studycreate.project">
						<input type="button" value="신청하기" class="btn">
						<input type="button" value="취소" class="btn">
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