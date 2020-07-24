package in.vinic.talky.domain.talk.command

import in.vinic.talky.domain.common.command.DomainCommand
import in.vinic.talky.domain.talk.entity.Speaker
import in.vinic.talky.domain.talk.valueobject.Title

final case class ScheduleTalkCommand(title: Title, speaker: Speaker) extends DomainCommand
