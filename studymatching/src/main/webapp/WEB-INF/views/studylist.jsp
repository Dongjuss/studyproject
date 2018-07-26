<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/commons/template/top.jsp"%>
    
    
    
    <!-- end header -->
    <section id="inner-headline">
      <div class="container" style="height: 100px;">
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
				<form class="form-search">
                  <input placeholder="검색어 입력하세요!." type="text" class="input-medium search-query" style="width: 590px;">
                  <button type="submit" class="btn btn-square btn-theme">Search</button>
                </form>
						 <table class="table table-striped">
							<tr>
								<th style="text-align: center;">주제</th>
								<th style="text-align: center;">제목</th>
								<th style="text-align: center;">위치</th>
								<th style="text-align: center;">등록날짜</th>
								<th style="text-align: center;">조회수</th>
								<th style="text-align: center;">추천수</th>		
							</tr>
							
							<tr>
								<td>기사자격증</td>
								<td><a href="${root}/pagemove/studycreatedetail.project">정보처리기사 실기인원 모집합니다</a></td>
								<td>경기도 안양시</td>
								<td>2018-07-24</td>
								<td>147</td>
								<td>38</td>		
							</tr>		
							<tr>
								<td>기사자격증</td>
								<td>정보처리기사 필기인원 모집합니다</td>
								<td>경기도 수원시</td>
								<td>2018-07-24</td>
								<td>552</td>
								<td>778</td>		
							</tr>			
							<tr>
								<td>기사자격증</td>
								<td>전기기사 실기인원 모집합니다</td>
								<td>경기도 성남시</td>
								<td>2018-07-24</td>
								<td>45</td>
								<td>41</td>		
							</tr>			
							<tr>
								<td>요리자격증</td>
								<td>한식 실기인원 모집합니다</td>
								<td>경기도 군포시</td>
								<td>2018-07-24</td>
								<td>427</td>
								<td>152</td>		
							</tr>
													
																																									
						</table>
						<div align="right">
						<a href="${root}/pagemove/studycreate.project">
						<input type="button" value="방생성" class="button">
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
