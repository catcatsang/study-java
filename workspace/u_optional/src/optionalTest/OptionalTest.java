package optionalTest;

import java.util.Optional;

public class OptionalTest {
   public static void main(String[] args) {
      // 어딘가에서 날아온 게시글 정보 1개
//      Post data = new Post(1L, "재밌는 서버!", "끝내줘요~!");
      Post data = null;
      
      Optional<Post> foundPost = Optional.ofNullable(data);
//      data가 null이 아닐 경우, 와 동일하게 Optional<Post> 객체를 생성합니다.
//      Optional 포스트 타입의 foundPost 를 선언 , 
      Post post = foundPost.orElseThrow(() -> {throw new RuntimeException();});
      
      
      
//      foundPost.ifPresent((post) -> {
//         System.out.println(post.getTitle());
//      });
//      foundPost.ifPresentOrElse((post) -> {
//         System.out.println(post.getTitle());
//      }, () -> {
//         System.out.println("조회 실패");
//      });
      
//      if(foundPost.isPresent()) {
//         data = foundPost.get();
//         System.out.println(data.getTitle());
//      }else {
//         System.out.println("조회 실패");
//      }
      
   }
}












