package com.lambdaminute.slinkywrappers.semanticui

import slinky.readwrite.Writer

import scala.scalajs.js

sealed trait IconName
object IconName {
  case object `search`                     extends IconName
  case object `mail outline`               extends IconName
  case object `external`                   extends IconName
  case object `signal`                     extends IconName
  case object `setting`                    extends IconName
  case object `home`                       extends IconName
  case object `inbox`                      extends IconName
  case object `browser`                    extends IconName
  case object `tag`                        extends IconName
  case object `tags`                       extends IconName
  case object `calendar`                   extends IconName
  case object `comment`                    extends IconName
  case object `comments`                   extends IconName
  case object `shop`                       extends IconName
  case object `privacy`                    extends IconName
  case object `settings`                   extends IconName
  case object `trophy`                     extends IconName
  case object `payment`                    extends IconName
  case object `feed`                       extends IconName
  case object `alarm outline`              extends IconName
  case object `tasks`                      extends IconName
  case object `cloud`                      extends IconName
  case object `lab`                        extends IconName
  case object `mail`                       extends IconName
  case object `idea`                       extends IconName
  case object `dashboard`                  extends IconName
  case object `sitemap`                    extends IconName
  case object `alarm`                      extends IconName
  case object `terminal`                   extends IconName
  case object `code`                       extends IconName
  case object `protect`                    extends IconName
  case object `calendar outline`           extends IconName
  case object `ticket`                     extends IconName
  case object `external square`            extends IconName
  case object `map`                        extends IconName
  case object `bug`                        extends IconName
  case object `mail square`                extends IconName
  case object `history`                    extends IconName
  case object `options`                    extends IconName
  case object `comment outline`            extends IconName
  case object `comments outline`           extends IconName
  case object `text telephone`             extends IconName
  case object `find`                       extends IconName
  case object `wifi`                       extends IconName
  case object `alarm slash`                extends IconName
  case object `alarm slash outline`        extends IconName
  case object `copyright`                  extends IconName
  case object `at`                         extends IconName
  case object `eyedropper`                 extends IconName
  case object `paint brush`                extends IconName
  case object `heartbeat`                  extends IconName
  case object `download`                   extends IconName
  case object `repeat`                     extends IconName
  case object `refresh`                    extends IconName
  case object `lock`                       extends IconName
  case object `bookmark`                   extends IconName
  case object `print`                      extends IconName
  case object `write`                      extends IconName
  case object `theme`                      extends IconName
  case object `adjust`                     extends IconName
  case object `edit`                       extends IconName
  case object `external share`             extends IconName
  case object `ban`                        extends IconName
  case object `mail forward`               extends IconName
  case object `share`                      extends IconName
  case object `expand`                     extends IconName
  case object `compress`                   extends IconName
  case object `unhide`                     extends IconName
  case object `hide`                       extends IconName
  case object `random`                     extends IconName
  case object `retweet`                    extends IconName
  case object `sign out`                   extends IconName
  case object `pin`                        extends IconName
  case object `sign in`                    extends IconName
  case object `upload`                     extends IconName
  case object `call`                       extends IconName
  case object `call square`                extends IconName
  case object `remove bookmark`            extends IconName
  case object `unlock`                     extends IconName
  case object `configure`                  extends IconName
  case object `filter`                     extends IconName
  case object `wizard`                     extends IconName
  case object `undo`                       extends IconName
  case object `exchange`                   extends IconName
  case object `cloud download`             extends IconName
  case object `cloud upload`               extends IconName
  case object `reply`                      extends IconName
  case object `reply all`                  extends IconName
  case object `erase`                      extends IconName
  case object `unlock alternate`           extends IconName
  case object `archive`                    extends IconName
  case object `translate`                  extends IconName
  case object `recycle`                    extends IconName
  case object `send`                       extends IconName
  case object `send outline`               extends IconName
  case object `share alternate`            extends IconName
  case object `share alternate square`     extends IconName
  case object wait_                        extends IconName
  case object `write square`               extends IconName
  case object `share square`               extends IconName
  case object `add to cart`                extends IconName
  case object `in cart`                    extends IconName
  case object `add user`                   extends IconName
  case object `remove user`                extends IconName
  case object `help circle`                extends IconName
  case object `info circle`                extends IconName
  case object `warning`                    extends IconName
  case object `warning circle`             extends IconName
  case object `warning sign`               extends IconName
  case object `help`                       extends IconName
  case object `info`                       extends IconName
  case object `announcement`               extends IconName
  case object `birthday`                   extends IconName
  case object `users`                      extends IconName
  case object `doctor`                     extends IconName
  case object `child`                      extends IconName
  case object `user`                       extends IconName
  case object `handicap`                   extends IconName
  case object `student`                    extends IconName
  case object `spy`                        extends IconName
  case object `female`                     extends IconName
  case object `male`                       extends IconName
  case object `woman`                      extends IconName
  case object `man`                        extends IconName
  case object `non binary transgender`     extends IconName
  case object `intergender`                extends IconName
  case object `transgender`                extends IconName
  case object `lesbian`                    extends IconName
  case object `gay`                        extends IconName
  case object `heterosexual`               extends IconName
  case object `other gender`               extends IconName
  case object `other gender vertical`      extends IconName
  case object `other gender horizontal`    extends IconName
  case object `neuter`                     extends IconName
  case object `grid layout`                extends IconName
  case object `list layout`                extends IconName
  case object `block layout`               extends IconName
  case object `zoom`                       extends IconName
  case object `zoom out`                   extends IconName
  case object `resize vertical`            extends IconName
  case object `resize horizontal`          extends IconName
  case object `maximize`                   extends IconName
  case object `crop`                       extends IconName
  case object `cocktail`                   extends IconName
  case object `road`                       extends IconName
  case object `flag`                       extends IconName
  case object `book`                       extends IconName
  case object `gift`                       extends IconName
  case object `leaf`                       extends IconName
  case object `fire`                       extends IconName
  case object `plane`                      extends IconName
  case object `magnet`                     extends IconName
  case object `legal`                      extends IconName
  case object `lemon`                      extends IconName
  case object `world`                      extends IconName
  case object `travel`                     extends IconName
  case object `shipping`                   extends IconName
  case object `money`                      extends IconName
  case object `lightning`                  extends IconName
  case object `rain`                       extends IconName
  case object `treatment`                  extends IconName
  case object `suitcase`                   extends IconName
  case object `bar`                        extends IconName
  case object `flag outline`               extends IconName
  case object `flag checkered`             extends IconName
  case object `puzzle`                     extends IconName
  case object `fire extinguisher`          extends IconName
  case object `rocket`                     extends IconName
  case object `anchor`                     extends IconName
  case object `bullseye`                   extends IconName
  case object `sun`                        extends IconName
  case object `moon`                       extends IconName
  case object `fax`                        extends IconName
  case object `life ring`                  extends IconName
  case object `bomb`                       extends IconName
  case object `soccer`                     extends IconName
  case object `calculator`                 extends IconName
  case object `diamond`                    extends IconName
  case object `crosshairs`                 extends IconName
  case object `asterisk`                   extends IconName
  case object `certificate`                extends IconName
  case object `circle`                     extends IconName
  case object `quote left`                 extends IconName
  case object `quote right`                extends IconName
  case object `ellipsis horizontal`        extends IconName
  case object `ellipsis vertical`          extends IconName
  case object `cube`                       extends IconName
  case object `cubes`                      extends IconName
  case object `circle notched`             extends IconName
  case object `circle thin`                extends IconName
  case object `square outline`             extends IconName
  case object `square`                     extends IconName
  case object `checkmark`                  extends IconName
  case object `remove`                     extends IconName
  case object `checkmark box`              extends IconName
  case object `move`                       extends IconName
  case object `add circle`                 extends IconName
  case object `minus circle`               extends IconName
  case object `remove circle`              extends IconName
  case object `check circle`               extends IconName
  case object `remove circle outline`      extends IconName
  case object `check circle outline`       extends IconName
  case object `plus`                       extends IconName
  case object `minus`                      extends IconName
  case object `add square`                 extends IconName
  case object `radio`                      extends IconName
  case object `selected radio`             extends IconName
  case object `minus square`               extends IconName
  case object `minus square outline`       extends IconName
  case object `check square`               extends IconName
  case object `plus square outline`        extends IconName
  case object `toggle off`                 extends IconName
  case object `toggle on`                  extends IconName
  case object `film`                       extends IconName
  case object `sound`                      extends IconName
  case object `photo`                      extends IconName
  case object `bar chart`                  extends IconName
  case object `camera retro`               extends IconName
  case object `newspaper`                  extends IconName
  case object `area chart`                 extends IconName
  case object `pie chart`                  extends IconName
  case object `line chart`                 extends IconName
  case object `arrow circle outline down`  extends IconName
  case object `arrow circle outline up`    extends IconName
  case object `chevron left`               extends IconName
  case object `chevron right`              extends IconName
  case object `arrow left`                 extends IconName
  case object `arrow right`                extends IconName
  case object `arrow up`                   extends IconName
  case object `arrow down`                 extends IconName
  case object `chevron up`                 extends IconName
  case object `chevron down`               extends IconName
  case object `pointing right`             extends IconName
  case object `pointing left`              extends IconName
  case object `pointing up`                extends IconName
  case object `pointing down`              extends IconName
  case object `arrow circle left`          extends IconName
  case object `arrow circle right`         extends IconName
  case object `arrow circle up`            extends IconName
  case object `arrow circle down`          extends IconName
  case object `caret down`                 extends IconName
  case object `caret up`                   extends IconName
  case object `caret left`                 extends IconName
  case object `caret right`                extends IconName
  case object `angle double left`          extends IconName
  case object `angle double right`         extends IconName
  case object `angle double up`            extends IconName
  case object `angle double down`          extends IconName
  case object `angle left`                 extends IconName
  case object `angle right`                extends IconName
  case object `angle up`                   extends IconName
  case object `angle down`                 extends IconName
  case object `chevron circle left`        extends IconName
  case object `chevron circle right`       extends IconName
  case object `chevron circle up`          extends IconName
  case object `chevron circle down`        extends IconName
  case object `toggle down`                extends IconName
  case object `toggle up`                  extends IconName
  case object `toggle right`               extends IconName
  case object `long arrow down`            extends IconName
  case object `long arrow up`              extends IconName
  case object `long arrow left`            extends IconName
  case object `long arrow right`           extends IconName
  case object `arrow circle outline right` extends IconName
  case object `arrow circle outline left`  extends IconName
  case object `toggle left`                extends IconName
  case object `power`                      extends IconName
  case object `trash`                      extends IconName
  case object `trash outline`              extends IconName
  case object `disk outline`               extends IconName
  case object `desktop`                    extends IconName
  case object `laptop`                     extends IconName
  case object `tablet`                     extends IconName
  case object `mobile`                     extends IconName
  case object `game`                       extends IconName
  case object `keyboard`                   extends IconName
  case object `plug`                       extends IconName
  case object `folder`                     extends IconName
  case object `folder open`                extends IconName
  case object `level up`                   extends IconName
  case object `level down`                 extends IconName
  case object `file`                       extends IconName
  case object `file outline`               extends IconName
  case object `file text`                  extends IconName
  case object `file text outline`          extends IconName
  case object `folder outline`             extends IconName
  case object `folder open outline`        extends IconName
  case object `file pdf outline`           extends IconName
  case object `file word outline`          extends IconName
  case object `file excel outline`         extends IconName
  case object `file powerpoint outline`    extends IconName
  case object `file image outline`         extends IconName
  case object `file archive outline`       extends IconName
  case object `file audio outline`         extends IconName
  case object `file video outline`         extends IconName
  case object `file code outline`          extends IconName
  case object `barcode`                    extends IconName
  case object `qrcode`                     extends IconName
  case object `fork`                       extends IconName
  case object `html5`                      extends IconName
  case object `css3`                       extends IconName
  case object `rss`                        extends IconName
  case object `rss square`                 extends IconName
  case object `openid`                     extends IconName
  case object `database`                   extends IconName
  case object `server`                     extends IconName
  case object `heart`                      extends IconName
  case object `star`                       extends IconName
  case object `empty star`                 extends IconName
  case object `thumbs outline up`          extends IconName
  case object `thumbs outline down`        extends IconName
  case object `star half`                  extends IconName
  case object `empty heart`                extends IconName
  case object `smile`                      extends IconName
  case object `frown`                      extends IconName
  case object `meh`                        extends IconName
  case object `star half empty`            extends IconName
  case object `thumbs up`                  extends IconName
  case object `thumbs down`                extends IconName
  case object `music`                      extends IconName
  case object `video play outline`         extends IconName
  case object `volume off`                 extends IconName
  case object `volume down`                extends IconName
  case object `volume up`                  extends IconName
  case object `record`                     extends IconName
  case object `step backward`              extends IconName
  case object `fast backward`              extends IconName
  case object `backward`                   extends IconName
  case object `play`                       extends IconName
  case object `pause`                      extends IconName
  case object `stop`                       extends IconName
  case object `forward`                    extends IconName
  case object `fast forward`               extends IconName
  case object `step forward`               extends IconName
  case object `eject`                      extends IconName
  case object `unmute`                     extends IconName
  case object `mute`                       extends IconName
  case object `video play`                 extends IconName
  case object `closed captioning`          extends IconName
  case object `marker`                     extends IconName
  case object `coffee`                     extends IconName
  case object `food`                       extends IconName
  case object `building outline`           extends IconName
  case object `hospital`                   extends IconName
  case object `emergency`                  extends IconName
  case object `first aid`                  extends IconName
  case object `military`                   extends IconName
  case object `h`                          extends IconName
  case object `location arrow`             extends IconName
  case object `space shuttle`              extends IconName
  case object `university`                 extends IconName
  case object `building`                   extends IconName
  case object `paw`                        extends IconName
  case object `spoon`                      extends IconName
  case object `car`                        extends IconName
  case object `taxi`                       extends IconName
  case object `tree`                       extends IconName
  case object `bicycle`                    extends IconName
  case object `bus`                        extends IconName
  case object `ship`                       extends IconName
  case object `motorcycle`                 extends IconName
  case object `street view`                extends IconName
  case object `hotel`                      extends IconName
  case object `train`                      extends IconName
  case object `subway`                     extends IconName
  case object `table`                      extends IconName
  case object `columns`                    extends IconName
  case object `sort`                       extends IconName
  case object `sort ascending`             extends IconName
  case object `sort descending`            extends IconName
  case object `sort alphabet ascending`    extends IconName
  case object `sort alphabet descending`   extends IconName
  case object `sort content ascending`     extends IconName
  case object `sort content descending`    extends IconName
  case object `sort numeric ascending`     extends IconName
  case object `sort numeric descending`    extends IconName
  case object `font`                       extends IconName
  case object `bold`                       extends IconName
  case object `italic`                     extends IconName
  case object `text height`                extends IconName
  case object `text width`                 extends IconName
  case object `align left`                 extends IconName
  case object `align center`               extends IconName
  case object `align right`                extends IconName
  case object `align justify`              extends IconName
  case object `list`                       extends IconName
  case object `outdent`                    extends IconName
  case object `indent`                     extends IconName
  case object `linkify`                    extends IconName
  case object `cut`                        extends IconName
  case object `copy`                       extends IconName
  case object `attach`                     extends IconName
  case object `save`                       extends IconName
  case object `content`                    extends IconName
  case object `unordered list`             extends IconName
  case object `ordered list`               extends IconName
  case object `strikethrough`              extends IconName
  case object `underline`                  extends IconName
  case object `paste`                      extends IconName
  case object `unlink`                     extends IconName
  case object `superscript`                extends IconName
  case object `subscript`                  extends IconName
  case object `header`                     extends IconName
  case object `paragraph`                  extends IconName
  case object `euro`                       extends IconName
  case object `pound`                      extends IconName
  case object `dollar`                     extends IconName
  case object `rupee`                      extends IconName
  case object `yen`                        extends IconName
  case object `ruble`                      extends IconName
  case object `won`                        extends IconName
  case object `lira`                       extends IconName
  case object `shekel`                     extends IconName
  case object `paypal`                     extends IconName
  case object `paypal card`                extends IconName
  case object `google wallet`              extends IconName
  case object `visa`                       extends IconName
  case object `mastercard`                 extends IconName
  case object `discover`                   extends IconName
  case object `american express`           extends IconName
  case object `stripe`                     extends IconName
  case object `twitter square`             extends IconName
  case object `facebook square`            extends IconName
  case object `linkedin square`            extends IconName
  case object `github square`              extends IconName
  case object `twitter`                    extends IconName
  case object `facebook`                   extends IconName
  case object `github`                     extends IconName
  case object `pinterest`                  extends IconName
  case object `pinterest square`           extends IconName
  case object `google plus square`         extends IconName
  case object `google plus`                extends IconName
  case object `linkedin`                   extends IconName
  case object `github alternate`           extends IconName
  case object `maxcdn`                     extends IconName
  case object `bitcoin`                    extends IconName
  case object `youtube square`             extends IconName
  case object `youtube`                    extends IconName
  case object `xing`                       extends IconName
  case object `xing square`                extends IconName
  case object `youtube play`               extends IconName
  case object `dropbox`                    extends IconName
  case object `stack overflow`             extends IconName
  case object `instagram`                  extends IconName
  case object `flickr`                     extends IconName
  case object `adn`                        extends IconName
  case object `bitbucket`                  extends IconName
  case object `bitbucket square`           extends IconName
  case object `tumblr`                     extends IconName
  case object `tumblr square`              extends IconName
  case object `apple`                      extends IconName
  case object `windows`                    extends IconName
  case object `android`                    extends IconName
  case object `linux`                      extends IconName
  case object `dribbble`                   extends IconName
  case object `skype`                      extends IconName
  case object `foursquare`                 extends IconName
  case object `trello`                     extends IconName
  case object `gittip`                     extends IconName
  case object `vk`                         extends IconName
  case object `weibo`                      extends IconName
  case object `renren`                     extends IconName
  case object `pagelines`                  extends IconName
  case object `stack exchange`             extends IconName
  case object `vimeo`                      extends IconName
  case object `slack`                      extends IconName
  case object `wordpress`                  extends IconName
  case object `yahoo`                      extends IconName
  case object `google`                     extends IconName
  case object `reddit`                     extends IconName
  case object `reddit square`              extends IconName
  case object `stumbleupon circle`         extends IconName
  case object `stumbleupon`                extends IconName
  case object `delicious`                  extends IconName
  case object `digg`                       extends IconName
  case object `pied piper`                 extends IconName
  case object `pied piper alternate`       extends IconName
  case object `drupal`                     extends IconName
  case object `joomla`                     extends IconName
  case object `behance`                    extends IconName
  case object `behance square`             extends IconName
  case object `steam`                      extends IconName
  case object `steam square`               extends IconName
  case object `spotify`                    extends IconName
  case object `deviantart`                 extends IconName
  case object `soundcloud`                 extends IconName
  case object `vine`                       extends IconName
  case object `codepen`                    extends IconName
  case object `jsfiddle`                   extends IconName
  case object `rebel`                      extends IconName
  case object `empire`                     extends IconName
  case object `git square`                 extends IconName
  case object `git`                        extends IconName
  case object `hacker news`                extends IconName
  case object `tencent weibo`              extends IconName
  case object `qq`                         extends IconName
  case object `wechat`                     extends IconName
  case object `slideshare`                 extends IconName
  case object `twitch`                     extends IconName
  case object `yelp`                       extends IconName
  case object `lastfm`                     extends IconName
  case object `lastfm square`              extends IconName
  case object `ioxhost`                    extends IconName
  case object `angellist`                  extends IconName
  case object `meanpath`                   extends IconName
  case object `buysellads`                 extends IconName
  case object `connectdevelop`             extends IconName
  case object `dashcube`                   extends IconName
  case object `forumbee`                   extends IconName
  case object `leanpub`                    extends IconName
  case object `sellsy`                     extends IconName
  case object `shirtsinbulk`               extends IconName
  case object `simplybuilt`                extends IconName
  case object `skyatlas`                   extends IconName
  case object `whatsapp`                   extends IconName
  case object `viacoin`                    extends IconName
  case object `medium`                     extends IconName
  case object `like`                       extends IconName
  case object `favorite`                   extends IconName
  case object `video`                      extends IconName
  case object `check`                      extends IconName
  case object `close`                      extends IconName
  case object `cancel`                     extends IconName
  case object `delete`                     extends IconName
  case object `x`                          extends IconName
  case object `user times`                 extends IconName
  case object `user close`                 extends IconName
  case object `user cancel`                extends IconName
  case object `user delete`                extends IconName
  case object `user x`                     extends IconName
  case object `zoom in`                    extends IconName
  case object `magnify`                    extends IconName
  case object `shutdown`                   extends IconName
  case object `clock`                      extends IconName
  case object `time`                       extends IconName
  case object `play circle outline`        extends IconName
  case object `headphone`                  extends IconName
  case object `camera`                     extends IconName
  case object `video camera`               extends IconName
  case object `picture`                    extends IconName
  case object `pencil`                     extends IconName
  case object `compose`                    extends IconName
  case object `point`                      extends IconName
  case object `tint`                       extends IconName
  case object `signup`                     extends IconName
  case object `plus circle`                extends IconName
  case object `dont`                       extends IconName
  case object `minimize`                   extends IconName
  case object `add`                        extends IconName
  case object `eye`                        extends IconName
  case object `attention`                  extends IconName
  case object `cart`                       extends IconName
  case object `shuffle`                    extends IconName
  case object `talk`                       extends IconName
  case object `chat`                       extends IconName
  case object `shopping cart`              extends IconName
  case object `bar graph`                  extends IconName
  case object `area graph`                 extends IconName
  case object `pie graph`                  extends IconName
  case object `line graph`                 extends IconName
  case object `key`                        extends IconName
  case object `cogs`                       extends IconName
  case object `discussions`                extends IconName
  case object `like outline`               extends IconName
  case object `dislike outline`            extends IconName
  case object `heart outline`              extends IconName
  case object `log out`                    extends IconName
  case object `thumb tack`                 extends IconName
  case object `winner`                     extends IconName
  case object `bookmark outline`           extends IconName
  case object `phone`                      extends IconName
  case object `phone square`               extends IconName
  case object `credit card`                extends IconName
  case object `hdd outline`                extends IconName
  case object `bullhorn`                   extends IconName
  case object `bell`                       extends IconName
  case object `bell outline`               extends IconName
  case object `bell slash`                 extends IconName
  case object `bell slash outline`         extends IconName
  case object `hand outline right`         extends IconName
  case object `hand outline left`          extends IconName
  case object `hand outline up`            extends IconName
  case object `hand outline down`          extends IconName
  case object `globe`                      extends IconName
  case object `wrench`                     extends IconName
  case object `briefcase`                  extends IconName
  case object `group`                      extends IconName
  case object `flask`                      extends IconName
  case object `sidebar`                    extends IconName
  case object `bars`                       extends IconName
  case object `list ul`                    extends IconName
  case object `list ol`                    extends IconName
  case object `numbered list`              extends IconName
  case object `magic`                      extends IconName
  case object `truck`                      extends IconName
  case object `currency`                   extends IconName
  case object `triangle down`              extends IconName
  case object `dropdown`                   extends IconName
  case object `triangle up`                extends IconName
  case object `triangle left`              extends IconName
  case object `triangle right`             extends IconName
  case object `envelope`                   extends IconName
  case object `conversation`               extends IconName
  case object `umbrella`                   extends IconName
  case object `clipboard`                  extends IconName
  case object `lightbulb`                  extends IconName
  case object `ambulance`                  extends IconName
  case object `medkit`                     extends IconName
  case object `fighter jet`                extends IconName
  case object `beer`                       extends IconName
  case object `plus square`                extends IconName
  case object `computer`                   extends IconName
  case object `circle outline`             extends IconName
  case object `intersex`                   extends IconName
  case object `asexual`                    extends IconName
  case object `spinner`                    extends IconName
  case object `gamepad`                    extends IconName
  case object `star half full`             extends IconName
  case object `question`                   extends IconName
  case object `eraser`                     extends IconName
  case object `microphone`                 extends IconName
  case object `microphone slash`           extends IconName
  case object `shield`                     extends IconName
  case object `target`                     extends IconName
  case object `play circle`                extends IconName
  case object `pencil square`              extends IconName
  case object `compass`                    extends IconName
  case object `amex`                       extends IconName
  case object `eur`                        extends IconName
  case object `gbp`                        extends IconName
  case object `usd`                        extends IconName
  case object `inr`                        extends IconName
  case object `cny`                        extends IconName
  case object `rmb`                        extends IconName
  case object `jpy`                        extends IconName
  case object `rouble`                     extends IconName
  case object `rub`                        extends IconName
  case object `krw`                        extends IconName
  case object `btc`                        extends IconName
  case object `sheqel`                     extends IconName
  case object `ils`                        extends IconName
  case object `try`                        extends IconName
  case object `zip`                        extends IconName
  case object `dot circle outline`         extends IconName
  case object `sliders`                    extends IconName
  case object `wi-fi`                      extends IconName
  case object `graduation`                 extends IconName
  case object `weixin`                     extends IconName
  case object `binoculars`                 extends IconName
  case object `gratipay`                   extends IconName
  case object `genderless`                 extends IconName
  case object `teletype`                   extends IconName
  case object `power cord`                 extends IconName
  case object `tty`                        extends IconName
  case object `cc`                         extends IconName
  case object `plus cart`                  extends IconName
  case object `arrow down cart`            extends IconName
  case object `detective`                  extends IconName
  case object `venus`                      extends IconName
  case object `mars`                       extends IconName
  case object `mercury`                    extends IconName
  case object `venus double`               extends IconName
  case object `female homosexual`          extends IconName
  case object `mars double`                extends IconName
  case object `male homosexual`            extends IconName
  case object `venus mars`                 extends IconName
  case object `mars stroke`                extends IconName
  case object `mars alternate`             extends IconName
  case object `mars vertical`              extends IconName
  case object `mars horizontal`            extends IconName
  case object `mars stroke vertical`       extends IconName
  case object `mars stroke horizontal`     extends IconName
  case object `facebook official`          extends IconName
  case object `pinterest official`         extends IconName
  case object `bed`                        extends IconName
  implicit val writer: Writer[IconName] = i => (if (i == wait_) "wait" else i.toString).asInstanceOf[js.Object]
}
