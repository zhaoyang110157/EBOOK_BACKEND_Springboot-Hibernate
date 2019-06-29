use ebook;
SET SQL_SAFE_UPDATES = 0;
delete from orders;
delete from book;
delete from users;

insert into book values ("挪威的森林",0,"./image/nuowei.jpg","9787532755387"," 村上春树 著，林少华 译", 10,50,"literature","　《挪威的森林（电影特别版）》是一部动人心弦的、平缓舒雅的、略带感伤的、百分之百的恋爱小说。
                书中主人公渡边以第一人称展开他同两个女孩间的爱情纠葛。渡边的第一个恋人直子原是他高中要好同学木月的女友，后来木月自杀了。一年后渡边同直子不期而遇并开始交往。此时的直子已变得娴静腼腆，美丽晶莹的眸子里不时掠过一丝难以捕捉的阴翳。
 两人只是日复一日地在落叶飘零的东京街头漫无目标地或前或后或并肩行走不止。
直子20岁生日的晚上两人发生了性关系，不料第二天直子便不知去向。
 几个月后直子来信说她住进一家远在深山里的精神疗养院。 渡边前去探望时发现直子开始带有成熟女性的丰腴与娇美。晚间两人虽同处一室，但渡边约束了自己，分手前表示永远等待直子。
  返校不久，由于一次偶然相遇，渡边开始与低年级的绿子交往。绿子同内向的直子截然相反，“简直就像迎着春天的晨光蹦跳到世界上来的一头小鹿”。
 这期间，渡边内心十分苦闷彷徨。一方面念念不忘直子缠绵的病情与柔情，一方面又难以抗拒绿子大胆的表白和迷人的活力。不久传来直子自杀的噩耗，渡边失魂魄地四处徒步旅行。
最后，在直子同房病友玲子的鼓励下，开始摸索此后的人生。");
insert into book values ("泥土之界",1,"./image/nitu.jpg","9787533955588","希拉莉·乔顿 著 ； 房小然 译",10,20,"literature",
            "　☆犹如密西西比三角洲的一场暴雨直面在泥淖中扭曲的血性和激情☆泥土之界，不是万物之界，亦不是种族之界，而是人心之界。 在城市长大的中产阶级女孩劳拉·沙佩尔为了摆脱孤独终老的命运，嫁给了一心向往种植园、渴望用双手的劳作在土地上创造财富的亨利·麦卡伦。
                亨利为了实现他的农场梦，举家从田纳西州的孟菲斯市搬到了密西西比三角洲地区。
                告别了舒适的家园和熟悉的亲友，面对一望无际的棉花地，劳拉却感到自己被禁锢在这一方泥土之界中。同样感到格格不入、无法与土地融为一体的，还有刚从二战战场上回来的杰米，和黑农佃户之子荣塞尔，共同经历的战后创伤带给了二人超越种族界限的友谊，却也招致了悲剧。
                终于，在一场暴风雨中，所有的苦难与仇恨、压抑和隐忍爆发，雨水、泥水与血泪相交织。在泥泞中踽踽独行的人们，会在风暴之后迎来希望吗？");

insert into book values ( "哈佛管理学",2,"./image/hafu.jpg","9787511339065","杜晗 编", 10 ,20,"science", "《哈佛管理学》从战略规划、领导能力、决策管理、绩效管理、中层管理、改革管理、成长战略、时间管理、招聘管理、人才管理、激励员工、交流管理、谈判管理、团队管理、重塑职业生涯、服务管理、财务管理、知识管理、口才管理等方面入手，涵盖了管理学的各个领域。");
					
insert into book values ("哲思",3,"./image/zhesi.jpg","1003-3483"," 时代青年杂志社",10,10,"magazine","《哲思》是由共青团河南省委主办的面向全国发行的综合文化类月刊。创刊于2002年，以“寻求心灵共鸣，展现人性光辉”为办刊理念，通过清新的文字、灵动的版式、独特的视角、平等的姿态等深入读者心灵。其内容包括“哲思●生活真谛”、“意林●人生絮语”、“成功●生存智慧”、“情感●爱的启示”等几大版块；成为一份清新的、智慧的、深入广大学生和中青年读者心灵的精品期刊。是国家“双效”期刊，河南省优秀期刊。\n十几年来紧密贴近读者，以寻求“心灵共鸣，展现人性光辉”为办刊理念，通过清新的文字、灵动的版式、独特的视角、平等的姿态深入读者心灵。其内容分哲思·生活真谛、意林·人生絮语、成功·生存智慧、情感·爱的启示等几大版式块；辅以有深度的生活、情感故事，成为一份清新的、智慧的，深入广大学生和青中年读者心灵的精品期刊。");

insert into users values ( "zhao",0,"123",1,"manager");
insert into users values ( "123",1,"123",1,"custom");
insert into users values ( "dump",2,"123",0,"custom");

insert into orders values(  1,0,20190409201800);
insert into orders values( 1,1,20190409201800);

insert into orderitem values(0,0,0,3,10);
insert into orderitem values(1,0,1,1,5);
insert into orderitem values(2,1,3,7,99);


      
                
                
                
                
                
                
                
                
                
        